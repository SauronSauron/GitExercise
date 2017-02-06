package com.company;

public class Main {

    public static void main(String[] args) {

        String apa = "vem vet var du bor?";
        System.out.println(apa);

        Food apMat = new Food();
        apMat.setFood("Bananer");

        System.out.println(apMat.getFood());
    }
}
