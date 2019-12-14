package com.stock.ex.admin.controller;

import com.stock.ex.admin.services.CityService;
import com.stock.ex.app.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CityController {


    @Autowired
    CityService cityService;

    @GetMapping("/city")
    public List<City> getAllCities(){
       return cityService.getAllCities();
    }

    @PostMapping("/city")
    public City postCity(@Valid @RequestBody City city){
        return cityService.postCity(city);
    }

    @PutMapping("/city/{city_id}")
    public City updateCity(@PathVariable UUID city_id, @Valid @RequestBody City cityRequest){
        return cityService.updateCity(city_id,cityRequest);
    }

    @DeleteMapping("/city/{city_id}")
    public ResponseEntity<?> deleteCity(@PathVariable UUID city_id){
        return cityService.deleteCity(city_id);
    }

}
