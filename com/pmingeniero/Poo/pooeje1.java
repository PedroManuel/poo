package com.pmingeniero.Poo;

import java.util.ArrayList;

class Pooeje1{
    public static void main(String[] args){
        ArrayList<aeronave> aviones = new ArrayList<aeronave>();

        aeronave aChina = new aeronave(5, 12, 2);
        aChina.setMatricula("XX222");
        aviones.add(aChina);

        aeronave aBinter = new atr();
        aBinter.setMatricula("BI113");
        aviones.add(aBinter);

        aeronave aBinter2 = new embraer();
        aBinter2.setMatricula("BE322");
        aviones.add(aBinter2);


        for(aeronave avion: aviones){
            System.out.println(avion.getMatricula() + " Bodegas:" + avion.getNBodegas());
            System.out.println (" -> Embraer: " + avion.getNPuestosUSB());
            if (avion instanceof embraer ){
                embraer av1 = (embraer) avion;
                System.out.println (" -> Embraer: " + av1.getNPuestosUSB());
            }
            if (avion instanceof atr){
                atr av2 = (atr) avion;
                System.out.println (" -> ATR: " + av2.getNAspasHelices());
            }
        }



    }
}