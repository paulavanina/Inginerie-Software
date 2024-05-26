package com.fis.proiectFis.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flightCode;
    private String orasdus;
    private String orasintors;
    private String airplaneType;
    private int numberOfSeatsEconomy;
    private int numberOfSeatsBusiness;
    private int numberOfSeatsFirstClass;
    private double priceEconomy;
    private double priceBusiness;
    private double priceFirstClass;
    private Date departureDateTime; // Data și ora de plecare
    private Date arrivalDateTime; // Data și ora de sosire

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    // Constructors


    public Flight(int id, String flightCode, String orasdus, String orasintors, String airplaneType, int numberOfSeatsEconomy, int numberOfSeatsBusiness, int numberOfSeatsFirstClass, double priceEconomy, double priceBusiness, double priceFirstClass, Airline airline, Route route, Schedule schedule, List<Reservation> reservations, Discount discount) {
        this.id = id;
        this.flightCode = flightCode;
        this.orasdus = orasdus;
        this.orasintors = orasintors;
        this.airplaneType = airplaneType;
        this.numberOfSeatsEconomy = numberOfSeatsEconomy;
        this.numberOfSeatsBusiness = numberOfSeatsBusiness;
        this.numberOfSeatsFirstClass = numberOfSeatsFirstClass;
        this.priceEconomy = priceEconomy;
        this.priceBusiness = priceBusiness;
        this.priceFirstClass = priceFirstClass;
        this.airline = airline;
        this.route = route;
        this.schedule = schedule;
        this.reservations = reservations;
        this.discount = discount;
    }

    public Flight() {
    }

    // Getters and Setters
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getOrasdus() {
        return orasdus;
    }

    public void setOrasdus(String orasdus) {
        this.orasdus = orasdus;
    }

    public String getOrasintors() {
        return orasintors;
    }

    public void setOrasintors(String orasintors) {
        this.orasintors = orasintors;
    }

    public int getNumberOfSeatsEconomy() {
        return numberOfSeatsEconomy;
    }

    public void setNumberOfSeatsEconomy(int numberOfSeatsEconomy) {
        this.numberOfSeatsEconomy = numberOfSeatsEconomy;
    }

    public int getNumberOfSeatsBusiness() {
        return numberOfSeatsBusiness;
    }

    public void setNumberOfSeatsBusiness(int numberOfSeatsBusiness) {
        this.numberOfSeatsBusiness = numberOfSeatsBusiness;
    }

    public int getNumberOfSeatsFirstClass() {
        return numberOfSeatsFirstClass;
    }

    public void setNumberOfSeatsFirstClass(int numberOfSeatsFirstClass) {
        this.numberOfSeatsFirstClass = numberOfSeatsFirstClass;
    }

    public double getPriceEconomy() {
        return priceEconomy;
    }

    public void setPriceEconomy(double priceEconomy) {
        this.priceEconomy = priceEconomy;
    }

    public double getPriceBusiness() {
        return priceBusiness;
    }

    public void setPriceBusiness(double priceBusiness) {
        this.priceBusiness = priceBusiness;
    }

    public double getPriceFirstClass() {
        return priceFirstClass;
    }

    public void setPriceFirstClass(double priceFirstClass) {
        this.priceFirstClass = priceFirstClass;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightCode='" + flightCode + '\'' +
                ", airplaneType='" + airplaneType + '\'' +
                ", numberOfSeatsEconomy=" + numberOfSeatsEconomy +
                ", numberOfSeatsBusiness=" + numberOfSeatsBusiness +
                ", numberOfSeatsFirstClass=" + numberOfSeatsFirstClass +
                ", priceEconomy=" + priceEconomy +
                ", priceBusiness=" + priceBusiness +
                ", priceFirstClass=" + priceFirstClass +
                ", airline=" + airline +
                ", route=" + route +
                ", schedule=" + schedule +
                ", reservations=" + reservations +
                ", discount=" + discount +
                '}';
    }
}
