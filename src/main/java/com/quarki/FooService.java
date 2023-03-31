package com.quarki;

import org.jooq.DSLContext;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sql.DataSource;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.quarki.db.jooq.tables.Foo.FOO;

@Singleton
public class FooService {

    @Inject
    DataSource ds;

    @Inject
    DSLContext dsl;

    @Inject
    FooMapper fooMapper;

    public void insert(Foo foo) {
        dsl.insertInto(FOO)
                .set(fooMapper.toRecord(foo))
                .execute();
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
