/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author MICHAL
 */
public class zad4 {
    
    public static void main(String[] args){
    HashMap<String,String> wyrazy = Map();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Słowa które możesz przetłumaczyć na jęzuk angielski: tak, nie, kobieta, bardzo, i, tylko, jest"
            + ", to, on, ona, dziecko, kiedy, gdzie, z, dobrze, tam, inny, jak, nawet, tutaj");  
    
        while(true)
        {
            System.out.println();
            System.out.println("Wpisz słowo, które chcesz przetłumaczyć: ");
            String slowo = scanner.next();
            System.out.println();
            System.out.println("Podane słowo: " + slowo);
            
            if(slowo.equals("koniec!") )
            {
            break;
            }
            
           String tlumaczenie = wyrazy.get(slowo);
           if(tlumaczenie != null && !tlumaczenie.isEmpty()) 
           { 
               System.out.println("Tłumaczenie: "+tlumaczenie);
           }
           else
           {
               System.out.println("Słownik nie zawiera tłumaczenia");
           }
               
        }       
    
    }
    
    private static HashMap<String,String> Map(){
    HashMap<String, String> wyrazy = new HashMap<>();
    
    wyrazy.put("tak", "yes");
    wyrazy.put("nie", "no");
    wyrazy.put("kobieta", "woman");
    wyrazy.put("bardzo", "very");
    wyrazy.put("i", "and");
    wyrazy.put("tylko", "just");
    wyrazy.put("jest", "is");
    wyrazy.put("to", "it");
    wyrazy.put("on", "he");
    wyrazy.put("ona", "she");
    wyrazy.put("dziecko", "child");
    wyrazy.put("kiedy", "when");
    wyrazy.put("gdzie", "where");
    wyrazy.put("z", "from");
    wyrazy.put("dobrze", "well");
    wyrazy.put("tam", "there");
    wyrazy.put("inny", "other");
    wyrazy.put("jak", "how");
    wyrazy.put("nawet", "even");
    wyrazy.put("tutaj", "here");
    wyrazy.put("koniec!", "the end!");
    
    return wyrazy;
    }
}
