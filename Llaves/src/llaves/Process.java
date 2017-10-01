/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llaves;

import java.util.Scanner;

/**
 *
 * @author Kaat
 */
public class Process{
    
    public void procesa(){
        Scanner entrada = new Scanner(System.in);
        
        String cifrar;
        String IPresult="";
        
        System.out.println("Texto a cifrar:");
        cifrar=entrada.next();            
        char[] texto=cifrar.toCharArray();
        
        int[] IP = { 
		58, 50, 42, 34, 26, 18, 10, 2,
		60, 52, 44, 36, 28, 20, 12, 4,
		62, 54, 46, 38, 30, 22, 14, 6,
		64, 56, 48, 40, 32, 24, 16, 8,
		57, 49, 41, 33, 25, 17, 9,  1,
		59, 51, 43, 35, 27, 19, 11, 3,
		61, 53, 45, 37, 29, 21, 13, 5,
		63, 55, 47, 39, 31, 23, 15, 7
	};
        
        int[] E = {
		32, 1,  2,  3,  4,  5,
		4,  5,  6,  7,  8,  9,
		8,  9,  10, 11, 12, 13,
		12, 13, 14, 15, 16, 17,
		16, 17, 18, 19, 20, 21,
		20, 21, 22, 23, 24, 25,
		24, 25, 26, 27, 28, 29,
		28, 29, 30, 31, 32, 1
	};
        
       //PERMUTACIÓN INICIAL IP 
        for(int i=0; i<IP.length; i++){
            IPresult+=texto[IP[i]-1];
        }
            System.out.println("IP: "+IPresult);
        
        //EXPANSIÓN DE R0
        String R0=IPresult.substring(32, 64);
        //Conversión de R0 a array
        char[] pR0=(R0).toCharArray(); 
            System.out.println("Ro: "+R0);
        
        String ExR0="";
        for(int i=0; i<E.length; i++){
            ExR0+=pR0[E[i]-1];
        }
            System.out.println("Exp: " + ExR0);
            
        // XoR con K1
        sgllaves objellaves=new sgllaves();   
        //Aqui imprime k1 null :(
        System.out.println("K1: "+objellaves.getK1());
        
        
              
        
    }
    //Clave:
    // 0001001100110100010101110111100110011011101111001101111111110001
    // Texto a cifrar:
    // 0000000100100011010001010110011110001001101010111100110111101111
}
