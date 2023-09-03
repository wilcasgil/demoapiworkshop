package com.example.demoapiworkshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoapiworkshop.models.Vehiculo;
import com.example.demoapiworkshop.repository.VehiculoRepository;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;
    public Vehiculo find(String id) {
        // Implementar
        return vehiculoRepository.findById(id).orElse(null);
    }

    public void save(Vehiculo vehiculo) {
        // Implementar
        vehiculoRepository.save(vehiculo);
    }

    public List<Vehiculo> findAll() {
        return vehiculoRepository.findAll();
    }

    public void delete(String id) {
        vehiculoRepository.deleteById(id);
    }
}
