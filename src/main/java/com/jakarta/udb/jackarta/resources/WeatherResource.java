/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakarta.udb.jackarta.resources;

/**
 *
 * @author eliel
 */

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/JakartaWeather")
public class WeatherResource {

    @Inject
    private WeatherService weatherService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public WeatherDTO getWeather(
            @QueryParam("latitude") double latitude,
            @QueryParam("longitude") double longitude) {

        return weatherService.getWeather(latitude, longitude);
    }
}

