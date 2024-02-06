package com.asif;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/tvseries")
public class TvSeriesResource {

    //http//:localhost:8080/tvseries/120

    @RestClient
    TvSeriesIdProxy proxy;

    @GET
    @Path("/{id}")
    public TvSeries getTvSeriesById(@PathParam("id") int id){

        return proxy.getTvSeriesById(id);

    }

}
