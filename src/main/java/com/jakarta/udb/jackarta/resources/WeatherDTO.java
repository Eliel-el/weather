/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakarta.udb.jackarta.resources;

/**
 *
 * @author eliel
 */
public class WeatherDTO {

    private double latitude;
    private double longitude;
    private String description;
    private double temperature;
    private double humidity;
    private double windSpeed;
    private String condition;

    public WeatherDTO() {}

    public WeatherDTO(double latitude, double longitude,
                      String description, double temperature,
                      double humidity, double windSpeed, String condition) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.condition = condition;
    }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public double getHumidity() { return humidity; }
    public void setHumidity(double humidity) { this.humidity = humidity; }

    public double getWindSpeed() { return windSpeed; }
    public void setWindSpeed(double windSpeed) { this.windSpeed = windSpeed; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }
}
