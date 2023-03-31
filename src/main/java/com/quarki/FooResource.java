package com.quarki;


import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Reader;
import java.sql.SQLException;

@Path("/foo")
@Slf4j
public class FooResource {

    @Inject
    FooService fooService;

    @POST
    public void insert(Foo foo) throws SQLException {
        log.info("{}", foo);
        fooService.insert(foo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Reader getAll() throws SQLException {
        return fooService.getAll();
    }
}
