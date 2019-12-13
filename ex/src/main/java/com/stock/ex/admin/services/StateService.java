package com.stock.ex.admin.services;

import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.State;
import com.stock.ex.app.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public class StateService {

    @Autowired
    StateRepository stateRepository;


    @GetMapping("/state")
    public List<State> getAllCities(){
        return stateRepository.findAll();
    }

    @PostMapping("/state")
    public State postState(@Valid @RequestBody State state){
        return stateRepository.save(state);
    }

    @PutMapping("/state/{state_id}")
    public State updateState(@PathVariable UUID state_id, @Valid @RequestBody State stateRequest){

        return stateRepository.findById(state_id).map(state -> {
            state.setName(stateRequest.getName());
            state.setLinkStat(stateRequest.getLinkStat());
            return stateRepository.save(state);
        }).orElseThrow(()-> new ResourceNotFoundException("StateId " + state_id + " not found"));
    }

    @DeleteMapping("/state/{state_id}")
    public ResponseEntity<?> deleteState(@PathVariable UUID state_id){
        return stateRepository.findById(state_id).map(state -> {
            stateRepository.delete(state);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("StateId " + state_id + " not found"));
    }
}
