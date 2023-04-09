package com.pmingeniero.Poo;

public class embraer extends aeronave {
    private int nPuestosUSB =  0;

    public embraer(){
        super(4, 132, 4);
        nPuestosUSB = 70;
    }

    public int getNPuestosUSB(){
        return nPuestosUSB;
    }
}
