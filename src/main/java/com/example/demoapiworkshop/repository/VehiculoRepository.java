package com.example.demoapiworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoapiworkshop.models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
}
