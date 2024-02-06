package com.asif;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@Path("/shows")
public interface TvSeriesIdProxy {

    //https://api.tvmaze.com/shows/120

    @GET
    @Path("/{id}")
    TvSeries getTvSeriesById(@PathParam("id") int id);
}
