/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class P1E5 {
    
    public static void main(String[] args) {
        //PRÁCTICA 1
        //DAVID RUIZ ORDÓÑEZ
        //Leer por teclado dos series de 10 números enteros y 
        //mezclarlas en una tercera de
        //la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Llena la lista 1 de números:");
        for (i=0;i<10;i++){
           lista1[i]=scan.nextInt();
        }
        System.out.println("Llena la lista 2 de números:");
        for (i=0;i<10;i++){
           lista2[i]=scan.nextInt();
        }
        for (i=0;i<10;i++){
            System.out.println(lista1[i]);
            System.out.println(lista2[i]);
        }
        
        
    }
    
}
