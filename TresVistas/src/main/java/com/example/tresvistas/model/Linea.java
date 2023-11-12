package com.example.tresvistas.model;

public class Linea {

    private int num;
    private String ubiInicio;

    private String ubiFin;

    public Linea(int num, String ubiInicio, String ubiFin) {
        this.num = num;
        this.ubiInicio = ubiInicio;
        this.ubiFin = ubiFin;
    }

    @Override
    public String toString() {
        return "Linea " + num + "\n" + ubiInicio + " -> " + ubiFin;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUbiInicio() {
        return ubiInicio;
    }

    public void setUbiInicio(String ubiInicio) {
        this.ubiInicio = ubiInicio;
    }

    public String getUbiFin() {
        return ubiFin;
    }

    public void setUbiFin(String ubiFin) {
        this.ubiFin = ubiFin;
    }
}
