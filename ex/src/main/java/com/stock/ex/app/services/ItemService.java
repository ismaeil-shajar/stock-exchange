package com.stock.ex.app.services;

import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.City;
import com.stock.ex.app.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public class ItemService {

//    @Autowired
//    CityRepository cityRepository;
//
//
//    @GetMapping("/city")
//    public List<City> getAllItems(){
//        return cityRepository.findAll();
//    }
//
//    @PostMapping("/city")
//    public City postCity(@Valid @RequestBody City city){
//        return cityRepository.save(city);
//    }
//
//    @PutMapping("/city/{city_id}")
//    public City updateCity(@PathVariable UUID city_id, @Valid @RequestBody City cityRequest){
//
//        return cityRepository.findById(city_id).map(city -> {
//            city.setName(cityRequest.getName());
//            city.setState(cityRequest.getState());
//            return cityRepository.save(city);
//        }).orElseThrow(()-> new ResourceNotFoundException("CityId " + city_id + " not found"));
//    }
//
//    @DeleteMapping("/city/{city_id}")
//    public ResponseEntity<?> deleteCity(@PathVariable UUID city_id){
//        return cityRepository.findById(city_id).map(city -> {
//            cityRepository.delete(city);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(()-> new ResourceNotFoundException("CityId " + city_id + " not found"));
//    }
}
