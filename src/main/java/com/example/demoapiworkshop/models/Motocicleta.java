package com.example.demoapiworkshop.models;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String id, String marca, String modelo, int cilindrada) {
        super(id, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public Motocicleta(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
