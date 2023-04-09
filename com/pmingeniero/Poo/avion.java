package com.pmingeniero.Poo;

public class avion{
    private String matricula;
    
    public void setMatricula (String value) {
        this.matricula = value;

    }
    public void volar(String fechaSalida){
        System.out.println("Avión: " + this.matricula);
    }

}