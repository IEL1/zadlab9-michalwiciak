/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MICHAL
 */
public class zad3 {
    public static void main(String[] args) {
    List<Samochody> lista = new ArrayList<>();

        Samochody chevrolet = new Samochody("Chevrolet", "Lacetti", 170, 9000, "czerwony");
        Samochody opel = new Samochody("Opel", "Astra", 180, 16000, "srebrny");
        Samochody mitsubishi = new Samochody("Mitsubishi", "Lancer", 200, 28000, "czarny");

        lista.add(chevrolet);
        lista.add(opel);
        lista.add(mitsubishi);

        System.out.println("Samochody: ");
        System.out.println(lista.get(0).toString());
        System.out.println(lista.get(1).toString());
        System.out.println(lista.get(2).toString());        
    }

}
