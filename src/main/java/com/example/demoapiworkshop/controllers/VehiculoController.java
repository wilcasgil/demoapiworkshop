package com.example.demoapiworkshop.controllers;

import com.example.demoapiworkshop.DTOs.VehiculoDTO;
import io.swagger.annotations.*;
import com.example.demoapiworkshop.models.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoapiworkshop.services.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
@Api(value = "Vehiculo Controller", description = "Gestión de Vehiculos")
public class VehiculoController {

    @Autowired
    VehiculoService vehiculoService;

    @ApiOperation(value = "Obtener vehiculo por ID", response = VehiculoDTO.class)
    @GetMapping("/{id}")
    public VehiculoDTO getVehiculo(@PathVariable String id) {
        return new VehiculoDTO(vehiculoService.find(id));
    }

    @ApiOperation(value = "Crear un nuevo vehiculo")
    @PostMapping("/")
    public void createVehiculo(@RequestBody VehiculoDTO vehiculo) {
        vehiculoService.save(new Vehiculo(vehiculo));
    }
}
