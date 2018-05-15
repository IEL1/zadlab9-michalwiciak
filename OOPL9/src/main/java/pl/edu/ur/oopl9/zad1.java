/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author MICHAL
 */
public class zad1 {
/**
     * @param tablica
     */
    public static void sortuj(int[] tablica){
    Arrays.sort(tablica);
    }
    
    public static void wyswietl(int[] tablica){
    System.out.println(Arrays.toString(tablica));
    }
    
    public static void main(String[] args) {
        Random losuj = new Random();
        int tablica[] =  new int[100];
        
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = losuj.nextInt();
        }
        
        sortuj(tablica);
        wyswietl(tablica);   
    }    
}
