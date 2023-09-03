package com.example.demoapiworkshop.models;

public class Monopatin extends Vehiculo {
    private boolean electrico;

    public Monopatin(String id, String marca, String modelo, boolean electrico) {
        super(id, marca, modelo);
        this.electrico = electrico;
    }

    public Monopatin(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
}
