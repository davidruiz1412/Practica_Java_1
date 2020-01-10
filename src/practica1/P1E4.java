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
public class P1E4 {
    
    public static void main(String[] args) {
        //Leer 10 números enteros. Debemos mostrarlos en el 
        //siguiente orden: el primero, el
        //último, el segundo, el penúltimo, el tercero, etc.
        int[] lista = new int[10];
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 10 números:");
        for (i=0;i<(lista.length);i++){
            lista[i]=scan.nextInt();
        }
        System.out.println("---------------------------------");
        for (i=0;i<(lista.length)/2;i++){
            System.out.println(lista[i]);
            System.out.println(lista[((lista.length)-1)-i]);
        }
    }
}
