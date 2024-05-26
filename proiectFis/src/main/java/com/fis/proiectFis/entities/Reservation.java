package com.fis.proiectFis.entities;

import jakarta.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passengerName;
    private String seatClass; // Economy, Business, First Class
    private int seatNumber;
    private double price;
    private boolean isRoundTrip;
    private boolean isLastMinute;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    private String orasPlecare;
    private String orasDestinatie;

    public Reservation(String passengerName, String seatClass, int seatNumber, double price, boolean isRoundTrip, boolean isLastMinute, Flight flight) {
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isRoundTrip = isRoundTrip;
        this.isLastMinute = isLastMinute;
        this.flight = flight;
        this.orasPlecare = flight.getOrasdus();
        this.orasDestinatie = flight.getOrasintors();
    }

    public Reservation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRoundTrip() {
        return isRoundTrip;
    }

    public void setRoundTrip(boolean roundTrip) {
        isRoundTrip = roundTrip;
    }

    public boolean isLastMinute() {
        return isLastMinute;
    }

    public void setLastMinute(boolean lastMinute) {
        isLastMinute = lastMinute;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getOrasDestinatie() {
        return orasDestinatie;
    }

    public void setOrasDestinatie(String orasDestinatie) {
        this.orasDestinatie = orasDestinatie;
    }
// Other constructors, getters, setters, and methods...
}