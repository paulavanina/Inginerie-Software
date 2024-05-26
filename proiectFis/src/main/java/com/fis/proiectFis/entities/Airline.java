package com.fis.proiectFis.entities;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
@Entity
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airline_id;
    private String name;
    private String username;
    private String password;
    @OneToMany
    private List<Flight> flights;

    public Airline(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.flights = new ArrayList<>();
    }

    public Airline() {

    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", flights=" + flights +
                '}';
    }
}