package com.fis.proiectFis.restAPI;

import com.fis.proiectFis.entities.Reservation;
import com.fis.proiectFis.repositories.RezervareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestApiRezervare {

    @Autowired
    RezervareRepo rezervareRepo;

    @GetMapping("/getAll/rezervare")
    public List<Reservation> getAll() {
        return rezervareRepo.findAll();
    }

    @PostMapping("/create/rezervare")
    public void create_zbor(@RequestBody Reservation rezervare) {
        rezervareRepo.save(rezervare);
    }

    @DeleteMapping("/delete/rezervare/{id}")
    public void delete_rezervare(@PathVariable int id) {
        rezervareRepo.deleteById(id);
    }

    @PutMapping("/update/rezervare")
    public void update(@RequestBody Reservation rezervare) {
        rezervareRepo.save(rezervare);
    }

    //@GetMapping("/search/rezervare")
    //public List<Reservation> searchByOrasdusAndOrasintors(@RequestParam String orasdus, @RequestParam String orasintors) {
      //  return rezervareRepo.findByOrasdusAndOrasintors(orasdus, orasintors);
    //}
}
