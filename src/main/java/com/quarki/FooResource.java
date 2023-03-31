package com.quarki;


import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.stream.Stream;

@Path("/foo")
@Slf4j
public class FooResource {

    @Inject
    FooService fooService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(Foo foo) {
        log.info("{}", foo);
        fooService.insert(foo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Stream<Foo> getAll() {
        return fooService.getAll();
    }
}
