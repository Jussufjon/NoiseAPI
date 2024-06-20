package com.prototype.prototype.controller;

import com.prototype.prototype.model.Noise;
import com.prototype.prototype.service.NoiseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/noise")
public class NoisesController {

    NoiseService noiseService;

    @GetMapping("/DbPerHour")
    public ResponseEntity<List<Integer>> DbPerHour(){
        List<Integer> values = noiseService.findByHour();
        return ResponseEntity.ok(values);
    }
}
