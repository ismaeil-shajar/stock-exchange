package com.stock.ex.admin.services;

import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.user.Users;
import com.stock.ex.app.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public class UsersService {

    @Autowired
    UsersRepository usersRepository;


    @GetMapping("/users")
    public List<Users> getAllCities(){
        return usersRepository.findAll();
    }

    @PostMapping("/users")
    public Users postUsers(@Valid @RequestBody Users users){
        return usersRepository.save(users);
    }

    @PutMapping("/users/{users_id}")
    public Users updateUsers(@PathVariable UUID users_id, @Valid @RequestBody Users usersRequest){

        return usersRepository.findById(users_id).map(users -> {
            users.setUserType(usersRequest.getUserType());
            return usersRepository.save(users);
        }).orElseThrow(()-> new ResourceNotFoundException("UsersId " + users_id + " not found"));
    }

    @DeleteMapping("/users/{users_id}")
    public ResponseEntity<?> deleteUsers(@PathVariable UUID users_id){
        return usersRepository.findById(users_id).map(users -> {
            usersRepository.delete(users);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("UsersId " + users_id + " not found"));
    }
}
