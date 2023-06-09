package com.quarki;

import com.quarki.db.jooq.tables.pojos.Foo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.util.List;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @Path("/foo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Foo foo() {
        return new Foo("bar", new Integer[]{3, 1, 4}, LocalDate.now(), 7);
    }
}