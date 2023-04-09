package com.pmingeniero.Poo;

public class aeronave{
    private int nBodegas = 0;
    private int asientos = 0;
    private int nTripulanteCP = 0;
    private String matricula = "";

    public aeronave( int nBod, int seat, int nTcp) {
        nBodegas = nBod;
        asientos = seat;
        nTripulanteCP = nTcp;
    }
    public int getNBodegas (){
        return nBodegas;
    }
    public int getAsientos(){
        return asientos;
    }
    public int getNTripulateCP(){
        return nTripulanteCP;
    }

    public void setMatricula(String text){
        matricula = text;
    }
    public String getMatricula(){
        return matricula;
    }

}