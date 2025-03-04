package com.example;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(1, 30, 45);
        Time t2 = new Time(3675);
        
        System.out.println("Oggetto t1: " + t1);
        System.out.println("Oggetto t2: " + t2);
        
        //t1.addSecondi(500);
       // System.out.println("t1 dopo aggiunta di 500 secondi: " + t1);
        
       // System.out.println("t2 in secondi: " + t2.convertiSecondi());
    }
}