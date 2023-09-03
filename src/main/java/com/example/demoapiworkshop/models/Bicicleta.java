package com.example.demoapiworkshop.models;

public class Bicicleta extends Vehiculo {
    private int numeroDeMarchas;

    public Bicicleta(String id, String marca, String modelo, int numeroDeMarchas) {
        super(id, marca, modelo);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Bicicleta(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }
}
