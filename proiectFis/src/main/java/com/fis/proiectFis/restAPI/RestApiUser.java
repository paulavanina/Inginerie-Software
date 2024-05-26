package com.fis.proiectFis.restAPI;

import com.fis.proiectFis.entities.Utilizator;
import com.fis.proiectFis.entities.Flight;
import com.fis.proiectFis.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestApiUser {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/getAll")
    public List<Utilizator> getAll(){
        return userRepo.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Utilizator utilizator){
        userRepo.save(utilizator);
    }

    @PutMapping("/update")
    public void update(@RequestBody Utilizator utilizator){
        userRepo.save(utilizator);}

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userRepo.deleteById(id);
    }
}
