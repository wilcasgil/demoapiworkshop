package com.example.demoapiworkshop.DTOs;

import com.example.demoapiworkshop.models.Vehiculo;
public class VehiculoDTO {
    private String id;
    private String marca;
    private String modelo;

    public VehiculoDTO(Vehiculo vehiculo) {
        this.id = vehiculo.getId();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
