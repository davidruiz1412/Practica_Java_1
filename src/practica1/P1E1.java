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
public class P1E1 {
    
    public static void main(String[] args) {
        // PRÁCTICA 1
        // Ejercicio 1: Leer 5 números y mostrarlos en 
        //              el mismo orden introducido.
        // DAVID RUIZ ORDÓÑEZ
        int[] lista_numeros=new int[5];
        int i;
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce 5 números:");
        
        for (i=0;i<5;i++){
            lista_numeros[i]=n.nextInt();
        }
        
        System.out.println("Los números que has introducido son:");
        
        for (i=0;i<5;i++){
            System.out.print(lista_numeros[i]+" ");
        }
    }
}
