package com.stock.ex.admin.services;

import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.Crop;
import com.stock.ex.app.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@Service
public class CropService {

    @Autowired
    CropRepository cropRepository;


    public List<Crop> getAllCrops(){
        return cropRepository.findAll();
    }


    public Crop postCrop(Crop Crop){
        return cropRepository.save(Crop);
    }


    public Crop updateCrop( UUID crop_id, Crop cropRequest){

        return cropRepository.findById(crop_id).map(crop -> {
            crop.setName(cropRequest.getName());
            crop.setDetails(cropRequest.getDetails());
            crop.setType(cropRequest.getType());
            return cropRepository.save(crop);
        }).orElseThrow(()-> new ResourceNotFoundException("CropId " + crop_id + " not found"));
    }

    public ResponseEntity<?> deleteCrop(UUID crop_id){
        return cropRepository.findById(crop_id).map(crop -> {
            cropRepository.delete(crop);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("CropId " + crop_id + " not found"));
    }
}
