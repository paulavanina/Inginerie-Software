package com.fis.proiectFis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.fis.proiectFis.entities.Flight;

@Entity
public class Utilizator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String parola;
    private String email;
    private String nume;
    private String rol;

    public Utilizator() {
    }
    public void someMethod() {
        // Crearea unei instanțe a clasei Flight
        Flight flight = new Flight();

        // Accesarea orașului de plecare și destinației din clasa Flight
        String orasdus = flight.getOrasdus();
        String orasintors = flight.getOrasintors();



}
    public Utilizator(int id, String parola, String email, String nume, String rol) {
        this.id = id;
        this.parola = parola;
        this.email = email;
        this.nume = nume;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
