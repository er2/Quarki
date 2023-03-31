package com.quarki;

import org.jooq.DSLContext;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.stream.Stream;

import static com.quarki.db.jooq.tables.Foo.FOO;

@Singleton
public class FooService {

    @Inject
    DSLContext db;

    @Inject
    FooMapper fooMapper;

    public void insert(Foo foo) {
        db.insertInto(FOO)
                .set(fooMapper.unmap(foo))
                .execute();
    }

    public Stream<Foo> getAll() {
        return db.selectFrom(FOO)
                .fetchStream()
                .map(fooMapper::map);
    }
}
