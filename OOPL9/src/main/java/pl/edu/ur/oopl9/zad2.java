/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.Random;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author MICHAL
 */
public class zad2 {
    
    public static void main(String[] args) {
        int a;
        Random losuj = new Random();
        TreeSet b = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            a = losuj.nextInt(101);
            b.add(a);
        }
        
        Iterator t = b.iterator();
        while (t.hasNext()) {
            System.out.println(t.next() + " ");
        }
        //W przypadku tego losowania liczby się nie powtarzają i są od razu ułożone od najmniejszej do największej
    } 
}
