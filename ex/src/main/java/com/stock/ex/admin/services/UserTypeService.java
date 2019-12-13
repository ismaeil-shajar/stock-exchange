package com.stock.ex.admin.services;

import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.user.UserType;
import com.stock.ex.app.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public class UserTypeService {

    @Autowired
    UserTypeRepository userTypeRepository;


    @GetMapping("/userType")
    public List<UserType> getAllCities(){
        return userTypeRepository.findAll();
    }

    @PostMapping("/userType")
    public UserType postUserType(@Valid @RequestBody UserType userType){
        return userTypeRepository.save(userType);
    }

    @PutMapping("/userType/{userType_id}")
    public UserType updateUserType(@PathVariable UUID userType_id, @Valid @RequestBody UserType userTypeRequest){

        return userTypeRepository.findById(userType_id).map(userType -> {
            userType.setType(userTypeRequest.getType());
            userType.setDescription(userTypeRequest.getDescription());
            return userTypeRepository.save(userType);
        }).orElseThrow(()-> new ResourceNotFoundException("UserTypeId " + userType_id + " not found"));
    }

    @DeleteMapping("/userType/{userType_id}")
    public ResponseEntity<?> deleteUserType(@PathVariable UUID userType_id){
        return userTypeRepository.findById(userType_id).map(userType -> {
            userTypeRepository.delete(userType);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("UserTypeId " + userType_id + " not found"));
    }
}
