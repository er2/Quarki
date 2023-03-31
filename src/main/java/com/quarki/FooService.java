package com.quarki;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sql.DataSource;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Singleton
public class FooService {

    @Inject
    DataSource ds;

    public void insert(Foo foo) throws SQLException {
        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("""
                     INSERT INTO FOO (NAME, NUMS, DATE) values (?, ?, ?);
                     """)) {
            preparedStatement.setString(1, foo.name());
            preparedStatement.setArray(2, connection.createArrayOf("INTEGER", foo.nums().toArray()));
            preparedStatement.setDate(3, java.sql.Date.valueOf(foo.date()));
            preparedStatement.execute();
        }
    }

    private static final String getAllSql = """
            select json_agg(row_to_json(foo.*))
            from foo;
            """;

    public Reader getAll() throws SQLException {
        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(getAllSql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();
            return resultSet.getCharacterStream(1);
        }
    }
}
