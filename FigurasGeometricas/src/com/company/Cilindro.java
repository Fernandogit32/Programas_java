package com.company;

public class Cilindro extends Figura {
    private double base;
    private double altura;
    @Override
    double getCalculoVolume() {
        return base*altura;
    }
}
