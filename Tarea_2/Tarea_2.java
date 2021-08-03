/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_2;

import java.util.Scanner;

/**
 *
 * @author 7010
 */
public class Tarea_2 {
     private static Scanner teclado = new Scanner(System.in);
         public static String LetrasAscii(String palabra){
        
        int codificar=0;
        String resultado = "";
        int llave = 9; 
        
        
        for (int x = 0; x < palabra.length(); x++) {  
           codificar = (int)palabra.charAt(x);
            codificar = codificar + llave;
            char caracter = (char) codificar;
            resultado = resultado + caracter;
            
        }
     return resultado;
    }
         
         public static String Desfrador(String palabra){
        
        int codificar=0;
        String resultado = "";
        int llave = 9; 
        
        
        for (int x = 0; x < palabra.length(); x++) {  
           codificar = (int)palabra.charAt(x);
            codificar = codificar - llave;
            char caracter = (char) codificar;
            resultado = resultado + caracter;
            
        }
     return resultado;
    }
         
         
         
    public static void main(String[] args) {
       // ejemplo1();
       String tex;
       String res = LetrasAscii("Hola Jutiapa"); 
        System.out.println("El texto cifrado es = " + res);
        
        System.out.println("Ingresa el texto cifrado");
        tex = teclado.nextLine();
        String rer = Desfrador(tex); 
        System.out.println("El texto decifrado es = " + rer);
        
    }         
    
}
