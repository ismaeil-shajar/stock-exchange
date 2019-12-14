package com.stock.ex.admin.auth.controller;

import com.stock.ex.admin.services.UserTypeService;

import com.stock.ex.app.model.user.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
public class UserTypeController {

    @Autowired
    UserTypeService userTypeService;


    @GetMapping("/UserType")
    public List<UserType> getAllCities(){
        return userTypeService.getAllUserTypes();
    }

    @PostMapping("/UserType")
    public UserType postUserType(@Valid @RequestBody UserType userType){
        return userTypeService.postUserType(userType);
    }

    @PutMapping("/UserType/{UserType_id}")
    public UserType updateUserType(@PathVariable UUID userType_id, @Valid @RequestBody UserType UserTypeRequest){
        return userTypeService.updateUserType(userType_id,UserTypeRequest);
    }

    @DeleteMapping("/UserType/{UserType_id}")
    public ResponseEntity<?> deleteUserType(@PathVariable UUID userType_id){
        return userTypeService.deleteUserType(userType_id);
    }
}
