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


    public List<Crop> getAllCities(){
        return CropRepository.findAll();
    }


    public Crop postCrop(Crop Crop){
        return CropRepository.save(Crop);
    }


    public Crop updateCrop( UUID Crop_id, Crop CropRequest){

        return CropRepository.findById(Crop_id).map(Crop -> {
            Crop.setName(CropRequest.getName());
            Crop.setDetails(CropRequest.getDetails());
            Crop.setType(CropRequest.getType());
            return CropRepository.save(Crop);
        }).orElseThrow(()-> new ResourceNotFoundException("CropId " + Crop_id + " not found"));
    }

    public ResponseEntity<?> deleteCrop(UUID crop_id){
        return CropRepository.findById(crop_id).map(Crop -> {
            CropRepository.delete(Crop);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("CropId " + crop_id + " not found"));
    }
}
