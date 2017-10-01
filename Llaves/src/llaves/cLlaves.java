/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llaves;

import java.util.ArrayList;
import java.util.Scanner;
import sun.rmi.runtime.Log;

/**
 *
 * @author Kaat
 */
public class cLlaves{
    
    public static final int[][][] S ={
            {
                {14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7},
                {0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8},
                {4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0},
                {15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13}
            },
            {
                {15, 1,  8,  14, 6,  11, 3,  4,  9,  7,  2,  13, 12, 0,  5,  10},
                {3,  13, 4,  7,  15, 2,  8,  14, 12, 0,  1,  10, 6,  9,  11, 5},
                {0,  14, 7,  11, 10, 4,  13, 1,  5,  8,  12, 6,  9,  3,  2,  15},
                {13, 8,  10, 1,  3,  15, 4,  2,  11, 6,  7,  12, 0,  5,  14, 9}
            },
            {
                {10, 0,  9,  14, 6,  3,  15, 5,  1,  13, 12, 7,  11, 4,  2,  8},
                {13, 7,  0,  9,  3,  4,  6,  10, 2,  8,  5,  14, 12, 11, 15, 1},
                {13, 6,  4,  9,  8,  15, 3,  0,  11, 1,  2,  12, 5,  10, 14, 7},
                {1,  10, 13, 0,  6,  9,  8,  7,  4,  15, 14, 3,  11, 5,  2,  12}
            },
            {
                {7,  13, 14, 3,  0,  6,  9,  10, 1,  2,  8,  5,  11, 12, 4,  15},
                {13, 8,  11, 5,  6,  15, 0,  3,  4,  7,  2,  12, 1,  10, 14, 9},
                {10, 6,  9,  0,  12, 11, 7,  13, 15, 1,  3,  14, 5,  2,  8,  4},
                {3,  15, 0,  6,  10, 1,  13, 8,  9,  4,  5,  11, 12, 7,  2,  14}
            },
            {
                    {2,  12, 4,  1,  7,  10, 11, 6,  8,  5,  3,  15, 13, 0,  14, 9},
                    {14, 11, 2,  12, 4,  7,  13, 1,  5,  0,  15, 10, 3,  9,  8,  6},
                    {4,  2,  1,  11, 10, 13, 7,  8,  15, 9,  12, 5,  6,  3,  0,  14},
                    {11, 8,  12, 7,  1,  14, 2,  13, 6,  15, 0,  9,  10, 4,  5,  3}
            },
            {
                    {12, 1,  10, 15, 9,  2,  6,  8,  0,  13, 3,  4,  14, 7,  5,  11},
                    {10, 15, 4,  2,  7,  12, 9,  5,  6,  1,  13, 14, 0,  11, 3,  8},
                    {9,  14, 15, 5,  2,  8,  12, 3,  7,  0,  4,  10, 1,  13, 11, 6},
                    {4,  3,  2,  12, 9,  5,  15, 10, 11, 14, 1,  7,  6,  0,  8,  13}
            },
            {
                    {4,  11, 2,  14, 15, 0,  8,  13, 3,  12, 9,  7,  5,  10, 6,  1},
                    {13, 0,  11, 7,  4,  9,  1,  10, 14, 3,  5,  12, 2,  15, 8,  6},
                    {1,  4,  11, 13, 12, 3,  7,  14, 10, 15, 6,  8,  0,  5,  9,  2},
                    {6,  11, 13, 8,  1,  4,  10, 7,  9,  5,  0,  15, 14, 2,  3,  12}
            },
            {
                    {13, 2,  8,  4,  6,  15, 11, 1,  10, 9,  3,  14, 5,  0,  12, 7},
                    {1,  15, 13, 8,  10, 3,  7,  4,  12, 5,  6,  11, 0,  14, 9,  2},
                    {7,  11, 4,  1,  9,  12, 14, 2,  0,  6,  10, 13, 15, 3,  5,  8},
                    {2,  1,  14, 7,  4,  10, 8,  13, 15, 12, 9,  0,  3,  5,  6,  11}
            }

    };
    
     int[] PERMUTATION = {
		16, 7,  20, 21,
		29, 12, 28, 17,
		1,  15, 23, 26,
		5,  18, 31, 10,
		2,  8,  24, 14,
		32, 27, 3,  9,
		19, 13, 30, 6,
		22, 11, 4,  25
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
    
    public void llaves(){
    Scanner entrada = new Scanner(System.in);
        
        String c00="";
        String clav;
        
        
        System.out.println("Clave:");
        //clav=entrada.next();
        clav="0001001100110100010101110111100110011011101111001101111111110001";
        char[] clave=clav.toCharArray();
        System.out.println(" ");
        // 0001001100110100010101110111100110011011101111001101111111110001 
        
        int[] PC1 = {
		57, 49, 41, 33, 25, 17, 9,
		1,  58, 50, 42, 34, 26, 18,
		10, 2,  59, 51, 43, 35, 27,
		19, 11, 3,  60, 52, 44, 36,
		63, 55, 47, 39, 31, 23, 15,
		7,  62, 54, 46, 38, 30, 22,
		14, 6,  61, 53, 45, 37, 29,
		21, 13, 5,  28, 20, 12, 4
	};
        
        int[] PC2 = {
		14, 17, 11, 24, 1,  5,
		3,  28, 15, 6,  21, 10,
		23, 19, 12, 4,  26, 8,
		16, 7,  27, 20, 13, 2,
		41, 52, 31, 37, 47, 55,
		30, 40, 51, 45, 33, 48,
		44, 49, 39, 56, 34, 53,
		46, 42, 50, 36, 29, 32
	};

        //PERMUTACION INICIAL PC1
        for(int i=0; i<PC1.length; i++){
            c00+=clave[PC1[i]-1];
        }
        
        //System.out.println(c00);
        String c0="";
        String d0="";
        //Divide la permutación inicial en dos
        c0=c00.substring(0, 28);
        d0=c00.substring(28, 56);
        //Recorre c0 y d0
        String c1;
        String d1;
        c1=c0.substring(1,28)+c0.substring(0,1);
        d1=d0.substring(1,28)+d0.substring(0,1);    
        //Juntando c1 y d1
        String k1="";
        String pk01=c1+d1;
        char[] pk1=pk01.toCharArray();  
        for(int i=0; i<PC2.length; i++){
            k1+=pk1[PC2[i]-1];
        }
        //IMPRIME K1
        sgllaves objllaves=new sgllaves();  
        objllaves.setK1(k1);
        
        System.out.println("K1: "+ k1);
        System.out.println("Pk01: " + pk01);
        System.out.println("pk1: " + pk1);
        
        // Recorre c1 y d1
        String c2;
        String d2;
        c2=c1.substring(1,28)+c1.substring(0,1);
        d2=d1.substring(1,28)+d1.substring(0,1);
        //Juntando c1 y d1
        String k2="";
        String pk02=c2+d2;
        char[] pk2=(pk02).toCharArray();  
        for(int i=0; i<PC2.length; i++){
            k2+=pk2[PC2[i]-1];
        }
        
        //IMPRIME K2
        System.out.println("K2: "+ k2);
        
        // Recorre c2 y d2
        String c3;
        String d3;
        c3=c2.substring(2,28)+c2.substring(0,2);
        d3=d2.substring(2,28)+d2.substring(0,2);
        //Juntando c3 y d3
        String k3="";
        String pk03=c3+d3;
        char[] pk3=(pk03).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k3+=pk3[PC2[i]-1];
        }
        // IMPRIME K3
        System.out.println("K3: "+ k3);     
        
        // Recorre c3 y d3
        String c4;
        String d4;
        c4=c3.substring(2,28)+c3.substring(0,2);
        d4=d3.substring(2,28)+d3.substring(0,2);
        //Juntando c4 y d4
        String k4="";
        String pk04=c4+d4;
        char[] pk4=(pk04).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k4+=pk4[PC2[i]-1];
        }
        //IMPRIME K4
        System.out.println("K4: "+ k4); 
        
        // Recorre c4 y d4
        String c5;
        String d5;
        c5=c4.substring(2,28)+c4.substring(0,2);
        d5=d4.substring(2,28)+d4.substring(0,2);
        //Juntando c5 y d5
        String k5="";
        String pk05=c5+d5;
        char[] pk5=(pk05).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k5+=pk5[PC2[i]-1];
        }
        //IMPRIME K5
        System.out.println("K5: "+ k5);
        
        // Recorre c5 y d5
        String c6;
        String d6;
        c6=c5.substring(2,28)+c5.substring(0,2);
        d6=d5.substring(2,28)+d5.substring(0,2);
        //Juntando c6 y d6
        String k6="";
        String pk06=c6+d6;
        char[] pk6=(pk06).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k6+=pk6[PC2[i]-1];
        }
        // IMPRIME K6
        System.out.println("K6: "+ k6);
        
        // Recorre c6 y d6
        String c7;
        String d7;
        c7=c6.substring(2,28)+c6.substring(0,2);
        d7=d6.substring(2,28)+d6.substring(0,2);
        //Juntando c7 y d7
        String k7="";
        String pk07=c7+d7;
        char[] pk7=(pk07).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k7+=pk7[PC2[i]-1];
        }
        // IMPRIME K7
        System.out.println("K7: "+ k7);
        
        // Recorre c7 y d7
        String c8;
        String d8;
        c8=c7.substring(2,28)+c7.substring(0,2);
        d8=d7.substring(2,28)+d7.substring(0,2);
        //Juntando c8 y d8
        String k8="";
        String pk08=c8+d8;
        char[] pk8=(pk08).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k8+=pk8[PC2[i]-1];
        }
        // IMPRIME K8
        System.out.println("K8: "+ k8);
        
        // Recorre c8 y d8
        String c9;
        String d9;
        c9=c8.substring(1,28)+c8.substring(0,1);
        d9=d8.substring(1,28)+d8.substring(0,1);
        //Juntando c9 y d9
        String k9="";
        String pk09=c9+d9;
        char[] pk9=(pk09).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k9+=pk9[PC2[i]-1];
        }
        // IMPRIME K9
        System.out.println("K9: "+ k9);
        
        // Recorre c9 y d9
        String c10;
        String d10;
        c10=c9.substring(2,28)+c9.substring(0,2);
        d10=d9.substring(2,28)+d9.substring(0,2);
        //Juntando c10 y d10
        String k10="";
        String pk010=c10+d10;
        char[] pk10=(pk010).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k10+=pk10[PC2[i]-1];
        }
        // IMPRIME K10
        System.out.println("K10: "+ k10);
        
        // Recorre c10 y d10
        String c11;
        String d11;
        c11=c10.substring(2,28)+c10.substring(0,2);
        d11=d10.substring(2,28)+d10.substring(0,2);
        //Juntando c11 y d11
        String k11="";
        String pk011=c11+d11;
        char[] pk11=(pk011).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k11+=pk11[PC2[i]-1];
        }
        // IMPRIME K11
        System.out.println("K11: "+ k11);
        
        // Recorre c11 y d11
        String c12;
        String d12;
        c12=c11.substring(2,28)+c11.substring(0,2);
        d12=d11.substring(2,28)+d11.substring(0,2);
        //Juntando c12 y d12
        String k12="";
        String pk012=c12+d12;
        char[] pk12=(pk012).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k12+=pk12[PC2[i]-1];
        }
        // IMPRIME K12
        System.out.println("K12: "+ k12);
        
        // Recorre c12 y d12
        String c13;
        String d13;
        c13=c12.substring(2,28)+c12.substring(0,2);
        d13=d12.substring(2,28)+d12.substring(0,2);
        //Juntando c13 y d13
        String k13="";
        String pk013=c13+d13;
        char[] pk13=(pk013).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k13+=pk13[PC2[i]-1];
        }
        // IMPRIME K13
        System.out.println("K13: "+ k13);
        
        // Recorre c13 y d13
        String c14;
        String d14;
        c14=c13.substring(2,28)+c13.substring(0,2);
        d14=d13.substring(2,28)+d13.substring(0,2);
        //Juntando c14 y d14
        String k14="";
        String pk014=c14+d14;
        char[] pk14=(pk014).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k14+=pk14[PC2[i]-1];
        }
        // IMPRIME K14
        System.out.println("K14: "+ k14);
        
        // Recorre c14 y d14
        String c15;
        String d15;
        c15=c14.substring(2,28)+c14.substring(0,2);
        d15=d14.substring(2,28)+d14.substring(0,2);
        //Juntando c15 y d15
        String k15="";
        String pk015=c15+d15;
        char[] pk15=(pk015).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k15+=pk15[PC2[i]-1];
        }
        // IMPRIME K15
        System.out.println("K15: "+ k15);
        
        // Recorre c15 y d15
        String c16;
        String d16;
        c16=c15.substring(1,28)+c15.substring(0,1);
        d16=d15.substring(1,28)+d15.substring(0,1);
        //Juntando c16 y d16
        String k16="";
        String pk016=c16+d16;
        char[] pk16=(pk016).toCharArray();
                
        for(int i=0; i<PC2.length; i++){
            k16+=pk16[PC2[i]-1];
        }
        // IMPRIME K16
        System.out.println("K16: "+ k16);
        System.out.println(" ");
        
//        ArrayList<String> keys = new ArrayList<String>();
//        //String keys[]= new String[16];
//        keys.add(k1);
//        keys.add(k2);
//        keys.add(k3);
//        keys.add(k4);
//        keys.add(k5);
//        keys.add(k6);
//        keys.add(k7);
//        keys.add(k8);
//        keys.add(k9);
//        keys.add(k10);
//        keys.add(k11);
//        keys.add(k12);
//        keys.add(k13);
//        keys.add(k14);
//        keys.add(k15);
//        keys.add(k16);
//        
//        for(int i=0; i<keys.size(); i++){
//            System.out.println(keys.get(i));
//        }
        String cifrar;
        String IPresult="";
        
        System.out.println("Texto a cifrar:");
        //cifrar=entrada.next();   
        cifrar="0000000100100011010001010110011110001001101010111100110111101111";
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
        
        
        
       //PERMUTACIÓN INICIAL IP 
        for(int i=0; i<IP.length; i++){
            IPresult+=texto[IP[i]-1];
        }
            System.out.println("IP: "+IPresult);
        
        //EXPANSIÓN DE R0
        String L0=IPresult.substring(0, 32);
        String R0=IPresult.substring(32, 64);
        //Conversión de R0 a array
        
            System.out.println("L0: "+L0);
            System.out.println("R0: "+R0);
        char[] pR0=(R0).toCharArray(); 
        
        String ExR0=Ext(pR0);
        System.out.println("Expansión R0: " + ExR0);
        //Xor de Expansion y k1
        String xor0=xor(ExR0, k1);
        //sBlock divide en bloques, hace match en la tabla SBoxes
        // y hace permutación de la concatenación de S(i)
        String xp0=sBlock(xor0);
        //Xor de permutación y L[i]
        String R1=xor(xp0,L0);
        System.out.println("R1: "+R1);
        System.out.println("_______________________________");
        
        char[] pR1=(R1).toCharArray();
        String ExR1=Ext(pR1);
        System.out.println("Expansión R1: "+ExR1);
        String xor1=xor(ExR1, k2);
        String xp1=sBlock(xor1);
        String R2=xor(xp1,R0);
        System.out.println("R2: "+R2);
        System.out.println("_______________________________");
        
        char[] pR2=(R2).toCharArray();
        String ExR2=Ext(pR2);
        System.out.println("Expansión R2: "+ExR2);
        String xor2=xor(ExR2, k3);
        String xp2=sBlock(xor2);
        String R3=xor(xp2,R1);
        System.out.println("R3: "+R3);
        System.out.println("_______________________________");
        
        char[] pR3=(R3).toCharArray();
        String ExR3=Ext(pR3);
        System.out.println("Expansión R3: "+ExR3);
        String xor3=xor(ExR3, k4);
        String xp3=sBlock(xor3);
        String R4=xor(xp3,R2);
        System.out.println("R4: "+R4);
        System.out.println("_______________________________");
        
        char[] pR4=(R4).toCharArray();
        String ExR4=Ext(pR4);
        System.out.println("Expansión R4: "+ExR4);
        String xor4=xor(ExR4, k5);
        String xp4=sBlock(xor4);
        String R5=xor(xp4,R3);
        System.out.println("R5: "+R5);
        System.out.println("_______________________________");
        
        char[] pR5=(R5).toCharArray();
        String ExR5=Ext(pR5);
        System.out.println("Expansión R5: "+ExR5);
        String xor5=xor(ExR5, k6);
        String xp5=sBlock(xor5);
        String R6=xor(xp5,R4);
        System.out.println("R6: "+R6);
        System.out.println("_______________________________");
        
        char[] pR6=(R6).toCharArray();
        String ExR6=Ext(pR6);
        System.out.println("Expansión R6: "+ExR6);
        String xor6=xor(ExR6, k7);
        String xp6=sBlock(xor6);
        String R7=xor(xp6,R5);
        System.out.println("R7: "+R7);
        System.out.println("_______________________________");
        
        char[] pR7=(R7).toCharArray();
        String ExR7=Ext(pR7);
        System.out.println("Expansión R7: "+ExR7);
        String xor7=xor(ExR7, k8);
        String xp7=sBlock(xor7);
        String R8=xor(xp7,R6);
        System.out.println("R8: "+R8);
        System.out.println("_______________________________");
        
        char[] pR8=(R8).toCharArray();
        String ExR8=Ext(pR8);
        System.out.println("Expansión R8: "+ExR8);
        String xor8=xor(ExR8, k9);
        String xp8=sBlock(xor8);
        String R9=xor(xp8,R7);
        System.out.println("R9: "+R9);
        System.out.println("_______________________________");
        
        char[] pR9=(R9).toCharArray();
        String ExR9=Ext(pR9);
        System.out.println("Expansión R9: "+ExR9);
        String xor9=xor(ExR9, k10);
        String xp9=sBlock(xor9);
        String R10=xor(xp9,R8);
        System.out.println("R10: "+R10);
        System.out.println("_______________________________");
        
        char[] pR10=(R10).toCharArray();
        String ExR10=Ext(pR10);
        System.out.println("Expansión R10: "+ExR10);
        String xor10=xor(ExR10, k11);
        String xp10=sBlock(xor10);
        String R11=xor(xp10,R9);
        System.out.println("R11: "+R11);
        System.out.println("_______________________________");
        
        char[] pR11=(R11).toCharArray();
        String ExR11=Ext(pR11);
        System.out.println("Expansión R11: "+ExR11);
        String xor11=xor(ExR11, k12);
        String xp11=sBlock(xor11);
        String R12=xor(xp11,R10);
        System.out.println("R12: "+R12);
        System.out.println("_______________________________");
        
        char[] pR12=(R12).toCharArray();
        String ExR12=Ext(pR12);
        System.out.println("Expansión R12: "+ExR12);
        String xor12=xor(ExR12, k13);
        String xp12=sBlock(xor12);
        String R13=xor(xp12,R11);
        System.out.println("R13: "+R13);
        System.out.println("_______________________________");
        
        char[] pR13=(R13).toCharArray();
        String ExR13=Ext(pR13);
        System.out.println("Expansión R13: "+ExR13);
        String xor13=xor(ExR13, k14);
        String xp13=sBlock(xor13);
        String R14=xor(xp13,R12);
        System.out.println("R14: "+R14);
        System.out.println("_______________________________");
        
        char[] pR14=(R14).toCharArray();
        String ExR14=Ext(pR14);
        System.out.println("Expansión R14: "+ExR14);
        String xor14=xor(ExR14, k15);
        String xp14=sBlock(xor14);
        String R15=xor(xp14,R13);
        System.out.println("R15: "+R15);
        System.out.println("_______________________________");
        
        char[] pR15=(R15).toCharArray();
        String ExR15=Ext(pR15);
        System.out.println("Expansión R15: "+ExR15);
        String xor15=xor(ExR15, k16);
        String xp15=sBlock(xor15);
        String R16=xor(xp15,R14);
        System.out.println("R16: "+R16);
        System.out.println("_______________________________");
        
        String preFinal= R16+R15;
        System.out.println("L16R16: " + preFinal);
        char[] preFin=(preFinal).toCharArray();
        
        int[] FP = {
		40, 8, 48, 16, 56, 24, 64, 32,
		39, 7, 47, 15, 55, 23, 63, 31,
		38, 6, 46, 14, 54, 22, 62, 30,
		37, 5, 45, 13, 53, 21, 61, 29,
		36, 4, 44, 12, 52, 20, 60, 28,
		35, 3, 43, 11, 51, 19, 59, 27,
		34, 2, 42, 10, 50, 18, 58, 26,
		33, 1, 41, 9, 49, 17, 57, 25
	};
        
        String Final="";
        for(int i=0; i<FP.length; i++){
            Final+=preFin[FP[i]-1];
        }
        
        System.out.println("Final: "+Final);
        
        // Final: 
        
        //sgllaves objellaves=new sgllaves();   
        //Aqui imprime k1 null :(
        
        //System.out.println("K1: "+k1);
        
//        System.out.println("ExR0 xor k1: " + xor(ExR0, k1));
//        //Primer bloque de 6 bits
//        String mB01="00" + xor0.substring(0, 1)+xor0.substring(5,6);
//        String nB01=xor0.substring(1, 5);
//        //Segundo bloque de 6 bits
//        String mB02="00" + xor0.substring(6, 7)+xor0.substring(11,12);
//        String nB02=xor0.substring(7, 11);
//        //Tercer bloque de 6 bits
//        String mB03="00" + xor0.substring(12, 13)+xor0.substring(17,18);
//        String nB03=xor0.substring(13, 17);
//        //Cuarto bloque de 6 bits
//        String mB04="00" + xor0.substring(18, 19)+xor0.substring(23,24);
//        String nB04=xor0.substring(19, 23);
//        //Quinto bloque de 6 bits
//        String mB05="00" + xor0.substring(24, 25)+xor0.substring(29,30);
//        String nB05=xor0.substring(25, 29);
//        //Sexto bloque de 6 bits
//        String mB06="00" + xor0.substring(30, 31)+xor0.substring(35,36);
//        String nB06=xor0.substring(31, 35);
//        //Septimo bloque de 6 bits
//        String mB07="00" + xor0.substring(36, 37)+xor0.substring(41,42);
//        String nB07=xor0.substring(37, 41);
//        //Octavo bloque de 6 bits
//        String mB08="00" + xor0.substring(42, 43)+xor0.substring(47,48);
//        String nB08=xor0.substring(43, 47);
//        
//        int valormB01=bin_dec(mB01);
//        int valornB01=bin_dec(nB01);
//        System.out.println("Bloque 1: "+mB01+ " " + nB01+" DEC: "+valormB01+" "+valornB01);
//        int valormB02=bin_dec(mB02);
//        int valornB02=bin_dec(nB02);
//        System.out.println("Bloque 2: "+mB02+ " " + nB02+" DEC: "+valormB02+" "+valornB02);
//        int valormB03=bin_dec(mB03);
//        int valornB03=bin_dec(nB03);
//        System.out.println("Bloque 3: "+mB03+ " " + nB03+" DEC: "+valormB03+" "+valornB03);
//        int valormB04=bin_dec(mB04);
//        int valornB04=bin_dec(nB04);  
//        System.out.println("Bloque 4: "+mB04+ " " + nB04+" DEC: "+valormB04+" "+valornB04);
//        int valormB05=bin_dec(mB05);
//        int valornB05=bin_dec(nB05);
//        System.out.println("Bloque 5: "+mB05+ " " + nB05+" DEC: "+valormB05+" "+valornB05);
//        int valormB06=bin_dec(mB06);
//        int valornB06=bin_dec(nB06);
//        System.out.println("Bloque 6: "+mB06+ " " + nB06+" DEC: "+valormB06+" "+valornB06);
//        int valormB07=bin_dec(mB07);
//        int valornB07=bin_dec(nB07);
//        System.out.println("Bloque 7: "+mB07+ " " + nB07+" DEC: "+valormB07+" "+valornB07);
//        int valormB08=bin_dec(mB08);
//        int valornB08=bin_dec(nB08);
//        System.out.println("Bloque 8: "+mB08+ " " + nB08+" DEC: "+valormB08+" "+valornB08);
//        
        
        }
    
    public String xor(String a, String key){
        String result="";
        char[] b= key.toString().toCharArray();
        char[] c = a.toCharArray();
        for(int i=0;i<c.length;i++){
            if((c[i]=='1' && b[i]=='1')||(c[i]=='0' && b[i]=='0')){
                c[i]='0';
            }else{
                c[i]='1';
            }
            result+=c[i];
        }
        return result;
    }
    
    public String Ext(char[] e){
        String Ex="";
        for(int i=0; i<E.length; i++){
            Ex+=e[E[i]-1];
        }
        return Ex;
    }
    
    public int bin_dec(String valor)
    {
        int dec=Integer.parseInt(valor,2);
        return dec;
    }
    
    public String sBlock(String b){
        System.out.println("INPUT: "+b);
        String output="";
        for(int i=0;i<S.length;i++){
            String sixString = b.substring(i*6,(i+1)*6);
            String m= ""+sixString.charAt(0)+sixString.charAt(sixString.length()-1);
            String n= sixString.substring(1,sixString.length()-1);

            System.out.println("Bloque "+i+": "+sixString+" m: "+m+" n: "+n);
            int[] col= S[i][Integer.parseInt(m,2)];
            //System.out.println("SBOX, COL: "+S[i][Integer.parseInt(ab,2)]);

            String row =""+ col[Integer.parseInt(n,2)];
            System.out.println("SBox match: "+col[Integer.parseInt(n,2)]);
            row =""+Binarization4(row);
            System.out.println("Valor del match: "+row);
            output+=row;
        }
        
        String tmp="";
        for(int i=0;i<PERMUTATION.length;i++){
            tmp+=output.substring(PERMUTATION[i]-1,PERMUTATION[i]);
        }
        System.out.println("SBOX, B1S1+B2S2+...: "+output);
        System.out.println("Permutación: "+tmp);

        return tmp;

    }
    
    public String Binarization4(String plainText){
        String binaryText=Integer.toBinaryString(Integer.parseInt(plainText));
        String tmp="";
        for(int i=0;i<(4-binaryText.length());i++){
            tmp+=0;
        }
        tmp+=binaryText;
        return tmp;
    }
    
    //Clave:
    // 0001001100110100010101110111100110011011101111001101111111110001
    // Texto a cifrar:
    // 0000000100100011010001010110011110001001101010111100110111101111
    //Cifrado:
    // 1000010111101000000100110101010000001111000010101011000000000000
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}