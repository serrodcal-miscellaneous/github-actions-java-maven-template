package com.serrodcal;

import javax.inject.Singleton;

import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Uni;

@Singleton
public class GreetingResource {

    
    @Route(path = "/hello", produces = "application/json")
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello");
    }
}