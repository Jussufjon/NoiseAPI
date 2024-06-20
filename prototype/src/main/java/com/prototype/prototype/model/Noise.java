package com.prototype.prototype.model;

import com.prototype.prototype.service.NoiseService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="noises")
public class Noise {
    @Id
    private int idNoise;
    @Column(name = "idEmployee")
    private int idEmployee;
    @Column(name = "time")
    private LocalDateTime time;
    @Column(name = "value")
    private int value;

}
