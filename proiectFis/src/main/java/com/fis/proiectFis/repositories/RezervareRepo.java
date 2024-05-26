package com.fis.proiectFis.repositories;

import com.fis.proiectFis.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface RezervareRepo extends JpaRepository<Reservation, Integer> {
    List<Reservation> findByFlightIdAndDate(int flightId, LocalDate date);
}
