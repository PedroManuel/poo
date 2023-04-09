package com.pmingeniero.Poo;

public class atr extends aeronave{
    private int nAspasHelices = 0;
    public atr(){
        super(2, 63, 2);
        nAspasHelices = 5;
    }
    
    public int getNAspasHelices(){
        return nAspasHelices;
    }
}
