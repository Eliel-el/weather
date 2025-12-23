/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakarta.udb.jackarta.resources;

/**
 *
 * @author eliel
 */
import jakarta.ejb.Stateless;
import java.util.Random;

@Stateless
public class WeatherService {

    private static final String[] DESCRIPTIONS = {
        "Temps ensoleillé",
        "Nuageux",
        "Pluvieux",
        "Orageux",
        "Partiellement nuageux",
        "Brumeux",
        "Neigeux",
        "Venteux",
        "Dégagé"
    };

    private static final String[] CONDITIONS = {
        "Excellent",
        "Bon",
        "Modéré",
        "Mauvais",
        "Très mauvais"
    };

    private static final Random random = new Random();

    public WeatherDTO getWeather(double latitude, double longitude) {

        // 🔹 Données aléatoires - peu importe les coordonnées
        String description = DESCRIPTIONS[random.nextInt(DESCRIPTIONS.length)];
        double temperature = -10 + (random.nextDouble() * 50); // Entre -10 et 40°C
        temperature = Math.round(temperature * 10.0) / 10.0; // Arrondir à 1 décimale

        double humidity = random.nextDouble() * 100; // Entre 0 et 100%
        humidity = Math.round(humidity * 10.0) / 10.0; // Arrondir à 1 décimale

        double windSpeed = random.nextDouble() * 30; // Entre 0 et 30 m/s
        windSpeed = Math.round(windSpeed * 10.0) / 10.0; // Arrondir à 1 décimale

        String condition = CONDITIONS[random.nextInt(CONDITIONS.length)];

        return new WeatherDTO(
                latitude,
                longitude,
                description,
                temperature,
                humidity,
                windSpeed,
                condition
        );
    }
}
