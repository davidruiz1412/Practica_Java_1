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
public class P1E6 {
    
    public static void main(String[] args) {
        //PRÁCTICA 1
        //DAVID RUIZ ORDÓÑEZ
        //Leer los datos correspondientes a dos series de 12 elementos
        //numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 
        //3 de la B, otros 3 de A, otros 3 de la B, etc.
        int[] lista1 = new int[12];
        int[] lista2 = new int[12];
        int i;
        int j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Llena la lista 1 con 12 números:");
        for (i=0;i<12;i++){
            lista1[i]=scan.nextInt();
        }
        System.out.println("Llena la lista 2 con 12 números:");
        for (i=0;i<12;i++){
            lista2[i]=scan.nextInt();
        }
        for (i=0;i<12;i=i+3){
            for (j=0;j<3;j++){
                System.out.println(lista1[i+j]);
            }
            for(j=0;j<3;j++){
                System.out.println(lista2[i+j]);
            }
        }
    }
    
}
