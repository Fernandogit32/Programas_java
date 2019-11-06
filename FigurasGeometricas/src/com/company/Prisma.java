package com.company;

public class Prisma extends Figura {
    private double ladoa1;
    private double ladoa2;

    public double getLadoa1() {
        return ladoa1;
    }

    public void setLadoa1(double ladoa1) {
        this.ladoa1 = ladoa1;
    }

    public double getLadoa2() {
        return ladoa2;
    }

    public void setLadoa2(double ladoa2) {
        this.ladoa2 = ladoa2;
    }

    public double getLadoa3() {
        return ladoa3;
    }

    public void setLadoa3(double ladoa3) {
        this.ladoa3 = ladoa3;
    }

    private double ladoa3;
    @Override
    double getCalculoVolume() {

        return ladoa1*ladoa2*ladoa3;
    }
}
