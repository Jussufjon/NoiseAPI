package com.prototype.prototype.repository;

import com.prototype.prototype.model.Noise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface NoiseRepository extends JpaRepository<Noise, Integer> {
    @Query("SELECT n.value FROM Noise WHERE YEAR(n.time) = YEAR(:timestamp) " +
            "AND MONTH(n.time) = MONTH(:timestamp) " +
            "AND DAY(n.time) = DAY(:timestamp) AND " +
            "HOUR(n.time) = Hour(:timestamp)")
    List<Integer> findByHour(LocalDateTime timestamp);
}
