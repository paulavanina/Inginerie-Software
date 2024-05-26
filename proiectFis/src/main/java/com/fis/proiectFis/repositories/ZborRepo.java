package com.fis.proiectFis.repositories;

import com.fis.proiectFis.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface ZborRepo extends JpaRepository<Flight,Integer> {
    List<Flight> findByorasdusAndorasintors(String orasdus, String orasintors);

}
