package com.trimble.Trimble.Cars;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Cars, Long> {
    List<Cars> findByStatus(String status);
}