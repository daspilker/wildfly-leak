package com.mycompany.app;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/test")
public class MyResource {
    @Inject
    private MyBean myBean;

    @GET
    @Produces(APPLICATION_JSON)
    public List<MyEntity> test() {
        return myBean.getEntities();
    }
}
