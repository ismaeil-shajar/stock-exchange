package com.stock.ex.admin.controller;

import com.stock.ex.admin.services.StateService;
import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.State;
import com.stock.ex.app.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api")
public class StateController {

    @Autowired
    StateService stateService;

    @GetMapping("/state")
    public List<State> getAllStates(){
        return stateService.getAllStates();
    }

    @PostMapping("/state")
    public State postState(@Valid @RequestBody State state){
        return stateService.postState(state);
    }

    @PutMapping("/state/{state_id}")
    public State updateState(@PathVariable UUID state_id, @Valid @RequestBody State stateRequest){
        return stateService.updateState(state_id,stateRequest);
    }

    @DeleteMapping("/state/{state_id}")
    public ResponseEntity<?> deleteState(@PathVariable UUID state_id){
        return stateService.deleteState(state_id);
         }
}
