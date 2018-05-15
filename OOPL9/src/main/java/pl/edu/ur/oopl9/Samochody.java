/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author MICHAL
 */
public class Samochody  {
    private String marka;
    private String nazwa_auta;
    private double v_max;
    private double cena;
    private String kolor;

    public Samochody(String marka, String nazwa_auta, double v_max, double cena, String kolor) {
        this.marka = marka;
        this.nazwa_auta = nazwa_auta;
        this.v_max = v_max;
        this.cena = cena;
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa_auta() {
        return nazwa_auta;
    }

    public void setNazwa_auta(String nazwa_auta) {
        this.nazwa_auta = nazwa_auta;
    }

    public double getV_max() {
        return v_max;
    }

    public void setV_max(double v_max) {
        this.v_max = v_max;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    
    @Override
    public String toString() {
        return  "Marka: " + marka + ", Nazwa: " + nazwa_auta + ", Predkość max: " + v_max + ", Cena: " + cena+ ", Kolor: " + kolor ;
    }
    
}
