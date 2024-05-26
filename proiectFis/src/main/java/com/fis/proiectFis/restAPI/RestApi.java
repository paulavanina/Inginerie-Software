package com.fis.proiectFis.restAPI;

import com.fis.proiectFis.entities.Flight;
import com.fis.proiectFis.repositories.ZborRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestApi {

    @Autowired
    ZborRepo zborRepo;

    @GetMapping("/getAll/zbor")
    public List<Flight> getAll(){
        return zborRepo.findAll();
    }

    @PostMapping("/create/zbor")
    public void create(@RequestBody Flight zbor){
       zborRepo.save(zbor);
    }

    @PutMapping("/update/zbor")
    public void update(@RequestBody Flight zbor){
        zborRepo.save(zbor);}

    @DeleteMapping("/delete/zbor/{id}")
    public void delete(@PathVariable int id){
        zborRepo.deleteById(id);
    }
}
