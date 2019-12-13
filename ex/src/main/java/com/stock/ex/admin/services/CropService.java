package com.stock.ex.admin.services;

import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.Crop;
import com.stock.ex.app.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public class CropService {

    @Autowired
    CropRepository CropRepository;


    @GetMapping("/Crop")
    public List<Crop> getAllCities(){
        return CropRepository.findAll();
    }

    @PostMapping("/Crop")
    public Crop postCrop(@Valid @RequestBody Crop Crop){
        return CropRepository.save(Crop);
    }

    @PutMapping("/Crop/{Crop_id}")
    public Crop updateCrop(@PathVariable UUID Crop_id, @Valid @RequestBody Crop CropRequest){

        return CropRepository.findById(Crop_id).map(Crop -> {
            Crop.setName(CropRequest.getName());
            Crop.setDetails(CropRequest.getDetails());
            Crop.setType(CropRequest.getType());
            return CropRepository.save(Crop);
        }).orElseThrow(()-> new ResourceNotFoundException("CropId " + Crop_id + " not found"));
    }

    @DeleteMapping("/Crop/{Crop_id}")
    public ResponseEntity<?> deleteCrop(@PathVariable UUID Crop_id){
        return CropRepository.findById(Crop_id).map(Crop -> {
            CropRepository.delete(Crop);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("CropId " + Crop_id + " not found"));
    }
}
