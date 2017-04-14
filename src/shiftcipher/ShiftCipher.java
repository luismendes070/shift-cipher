/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftcipher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luism
 */
public class ShiftCipher {

    /*key K*/
    private int k = 19;
    
    /*number X*/
    private int x;
    
    /**/
    private int y;
    private int z;
    private ArrayList<String> lista;

    public ShiftCipher(String message) {

        lista = new ArrayList<>();
        
        for (int i = 0; i < message.length(); i++) {

            try {
                
                x = encrypt(String.format("%c", message.charAt(i)));
                
                y = (x + k) % 26;

                lista.add(encrypt(y));
                
            } catch (Exception e) {
   
            }
        }
        System.out.println(lista);
    }

    int encrypt(String m) {

        //System.out.println("Encrypting String m = "+m);
        
        HashMap<String, Integer> alfabeto = new HashMap<>(26);

        alfabeto.put("A", 0);
        alfabeto.put("B", 1);
        alfabeto.put("C", 2);
        alfabeto.put("D", 3);
        alfabeto.put("E", 4);
        alfabeto.put("F", 5);
        alfabeto.put("G", 6);
        alfabeto.put("H", 7);
        alfabeto.put("I", 8);
        alfabeto.put("J", 9);
        alfabeto.put("K", 10);
        alfabeto.put("L", 11);
        alfabeto.put("M", 12);
        alfabeto.put("N", 13);
        alfabeto.put("O", 14);
        alfabeto.put("P", 15);
        alfabeto.put("Q", 16);
        alfabeto.put("R", 17);
        alfabeto.put("S", 18);
        alfabeto.put("T", 19);
        alfabeto.put("U", 20);
        alfabeto.put("V", 21);
        alfabeto.put("W", 22);
        alfabeto.put("X", 23);
        alfabeto.put("Y", 24);
        alfabeto.put("Z", 25);
        
        return alfabeto.get(m);
    }
    
    String encrypt(int m) {

        
        //System.out.println("Encrypting int m = "+m);
        
        HashMap<String, Integer> alfabeto = new HashMap<>(26);

        alfabeto.put("A", 0);
        alfabeto.put("B", 1);
        alfabeto.put("C", 2);
        alfabeto.put("D", 3);
        alfabeto.put("E", 4);
        alfabeto.put("F", 5);
        alfabeto.put("G", 6);
        alfabeto.put("H", 7);
        alfabeto.put("I", 8);
        alfabeto.put("J", 9);
        alfabeto.put("K", 10);
        alfabeto.put("L", 11);
        alfabeto.put("M", 12);
        alfabeto.put("N", 13);
        alfabeto.put("O", 14);
        alfabeto.put("P", 15);
        alfabeto.put("Q", 16);
        alfabeto.put("R", 17);
        alfabeto.put("S", 18);
        alfabeto.put("T", 19);
        alfabeto.put("U", 20);
        alfabeto.put("V", 21);
        alfabeto.put("W", 22);
        alfabeto.put("X", 23);
        alfabeto.put("Y", 24);
        alfabeto.put("Z", 25);
        
        String s = null;
        
        for (Map.Entry<String, Integer> entry : alfabeto.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if( m == (int)value){
                s = key;
            }
            
        }
        
        return s;
    }

}
