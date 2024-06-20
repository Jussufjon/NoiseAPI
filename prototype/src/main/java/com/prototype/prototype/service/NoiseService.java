package com.prototype.prototype.service;

import com.prototype.prototype.repository.NoiseRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class NoiseService {
    private NoiseRepository repository;

    public List<Integer> findByHour(){
        LocalDateTime now = LocalDateTime.now();
        return repository.findByHour(now);
    }
}
