package com.fis.proiectFis.controller;


import com.fis.proiectFis.entities.Flight;
import com.fis.proiectFis.entities.Reservation;
import com.fis.proiectFis.service.FlightReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightReservationService flightReservationService;

//    @GetMapping("/search")
//    public ResponseEntity<List<Flight>> searchFlights(@RequestParam String departureCity, @RequestParam String arrivalCity) {
//        //List<Flight> flights = flightReservationService.searchFlights(departureCity, arrivalCity);
//        //return ResponseEntity.ok(flights);
//    }
//
//    @GetMapping("/{flightId}/availability")
//    public ResponseEntity<List<Reservation>> getAvailableSeats(@PathVariable Integer id, @RequestParam LocalDate date) {
//       // List<Reservation> availableSeats = flightReservationService.getAvailableSeats(id, date);
//        //return ResponseEntity.ok(availableSeats);
//    }
}
