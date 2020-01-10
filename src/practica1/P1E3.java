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
public class P1E3 {
    
    public static void main(String[] args) {
        // Leer 5 números por teclado y a continuación realizar la 
        // media de los números positivos, la media de los negativos y contar 
        // el número de ceros.
        
        int[] lista_numeros=new int[5];
        int i;
        int suma_pos=0;
        int suma_neg=0;
        int ceros=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 5 números:");
        
        for (i=0;i<5;i++){
            lista_numeros[i]=scan.nextInt();
        }
        
        for (i=0;i<5;i++){
            if (lista_numeros[i]>0){
                suma_pos=suma_pos+lista_numeros[i];
            }
            else if(lista_numeros[i]<0){
                suma_neg=suma_neg+lista_numeros[i];
            }
            else{
                ceros++;
            }
        }
        
        System.out.println("La media de los números positivos es:");
        System.out.println(suma_pos/2);
        System.out.println("La media de los números negativos es:");
        System.out.println(suma_neg/2);
        System.out.println("Hay una cantidad de "+ceros+" ceros.");
    }
}
