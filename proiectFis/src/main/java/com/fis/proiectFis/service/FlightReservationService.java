package com.fis.proiectFis.service;


import com.fis.proiectFis.entities.Flight;
import com.fis.proiectFis.entities.Reservation;
import com.fis.proiectFis.repositories.ZborRepo;
import com.fis.proiectFis.repositories.RezervareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Service
public class FlightReservationService {
    @Autowired
    private ZborRepo flightRepository;

    public List<FlightDetails> searchFlights(String departureCity, String arrivalCity) {
        List<Flight> foundFlights = flightRepository.findByorasdusAndorasintors(departureCity, arrivalCity);
        List<FlightDetails> flightDetailsList = new ArrayList<>();

        if (foundFlights.isEmpty()) {
            System.out.println("Ne pare rău, nu s-au găsit zboruri pentru această rută. Vă rugăm să încercați o altă căutare.");
        } else {
            for (Flight flight : foundFlights) {
                double priceWithDiscount = calculatePriceWithDiscount(flight);

                FlightDetails flightDetails = new FlightDetails();
                flightDetails.setFlightCode(flight.getFlightCode());
                flightDetails.setAirline(flight.getAirline().getName()); // Assuming Airline has a 'name' property
                //LocalDateTime departureTime = convertToLocalDateTime(flight.getSchedule().getDepartureTime());
                //LocalDateTime arrivalTime = convertToLocalDateTime(flight.getSchedule().getArrivalTime());
                flightDetails.setPrice(priceWithDiscount);

                flightDetailsList.add(flightDetails);
            }
        }
        return flightDetailsList;
    }

    private double calculatePriceWithDiscount(Flight flight) {
        // Logic to calculate price with discounts
        // Assuming you have some discount logic implemented
        return flight.getPriceEconomy(); // Just an example, replace with actual logic
    }

    public static class FlightDetails {
        private String flightCode;
        private String airline;
        private LocalDateTime departureTime;
        private LocalDateTime arrivalTime;
        private double price;

        // Getters and setters

        public String getFlightCode() {
            return flightCode;
        }

        public void setFlightCode(String flightCode) {
            this.flightCode = flightCode;
        }

        public String getAirline() {
            return airline;
        }

        public void setAirline(String airline) {
            this.airline = airline;
        }

        public LocalDateTime getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(LocalDateTime departureTime) {
            this.departureTime = departureTime;
        }

        public LocalDateTime getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(LocalDateTime arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
}
}