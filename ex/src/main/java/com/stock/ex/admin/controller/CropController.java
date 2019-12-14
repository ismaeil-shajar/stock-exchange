package com.stock.ex.admin.controller;

import com.stock.ex.admin.services.CropService;
import com.stock.ex.app.exception.ResourceNotFoundException;
import com.stock.ex.app.model.Crop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CropController {

    @Autowired
    CropService cropService;


    @GetMapping("/Crop")
    public List<Crop> getAllCrops(){
        return cropService.getAllCrops();
    }

    @PostMapping("/Crop")
    public Crop postCrop(@Valid @RequestBody Crop crop){
        return cropService.postCrop(crop);
    }

    @PutMapping("/Crop/{Crop_id}")
    public Crop updateCrop(@PathVariable UUID crop_id, @Valid @RequestBody Crop cropRequest){
       return cropService.updateCrop(crop_id,cropRequest);
    }

    @DeleteMapping("/Crop/{Crop_id}")
    public ResponseEntity<?> deleteCrop(@PathVariable UUID crop_id){
        return cropService.deleteCrop(crop_id);
    }
}
