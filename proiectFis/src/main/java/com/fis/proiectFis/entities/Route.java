package com.fis.proiectFis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Map;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int route_id;
    // Consider changing this to a supported type or using @ElementCollection for a simple map
    private String airportArrivalDepartureTimes; // Simplified for JPA

    public Route(String airportArrivalDepartureTimes) {
        this.airportArrivalDepartureTimes = airportArrivalDepartureTimes;
    }

    public Route() {
    }

    public int getId() {
        return route_id;
    }

    public void setId(int id) {
        this.route_id = id;
    }

    public String getAirportArrivalDepartureTimes() {
        return airportArrivalDepartureTimes;
    }

    public void setAirportArrivalDepartureTimes(String airportArrivalDepartureTimes) {
        this.airportArrivalDepartureTimes = airportArrivalDepartureTimes;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + route_id +
                ", airportArrivalDepartureTimes='" + airportArrivalDepartureTimes + '\'' +
                '}';
    }
}
