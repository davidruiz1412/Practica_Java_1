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
public class P1E7 {

    //Incluye los 6 ejercicios anteriores en métodos, y realiza un 
    //programa principal que pida al usuario que método 
    //quiere ejecutar y llame a este.
    public static void ejercicio1() {
        int[] lista_numeros = new int[5];
        int i;
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce 5 números: ");

        for (i = 0; i < 5; i++) {
            lista_numeros[i] = n.nextInt();
        }

        System.out.println("Los números que has introducido son:");

        for (i = 0; i < 5; i++) {
            System.out.print(lista_numeros[i] + " ");
        }
    }

    public static void ejercicio2() {
        int[] lista_numeros = new int[5];
        int i;
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        for (i = 0; i < 5; i++) {
            lista_numeros[i] = n.nextInt();
        }

        System.out.println("Los números que has introducido son:");

        for (i = 4; i >= 0; i--) {
            System.out.print(lista_numeros[i] + " ");
        }
    }

    public static void ejercicio3() {
        int[] lista_numeros = new int[5];
        int i;
        int suma_pos = 0;
        int suma_neg = 0;
        int ceros = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        for (i = 0; i < 5; i++) {
            lista_numeros[i] = scan.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (lista_numeros[i] > 0) {
                suma_pos = suma_pos + lista_numeros[i];
            } else if (lista_numeros[i] < 0) {
                suma_neg = suma_neg + lista_numeros[i];
            } else {
                ceros++;
            }
        }

        System.out.println("La media de los números positivos es:");
        System.out.println(suma_pos / 2);
        System.out.println("La media de los números negativos es:");
        System.out.println(suma_neg / 2);
        System.out.println("Hay una cantidad de " + ceros + " ceros.");
    }

    public static void ejercicio4() {
        int[] lista = new int[10];
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 10 números:");
        for (i = 0; i < (lista.length); i++) {
            lista[i] = scan.nextInt();
        }
        System.out.println("---------------------------------");
        for (i = 0; i < (lista.length) / 2; i++) {
            System.out.println(lista[i]);
            System.out.println(lista[((lista.length) - 1) - i]);
        }
    }

    public static void ejercicio5() {
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Llena la lista 1 de números:");
        for (i = 0; i < 10; i++) {
            lista1[i] = scan.nextInt();
        }
        System.out.println("Llena la lista 2 de números:");
        for (i = 0; i < 10; i++) {
            lista2[i] = scan.nextInt();
        }
        for (i = 0; i < 10; i++) {
            System.out.println(lista1[i]);
            System.out.println(lista2[i]);
        }
    }

    public static void ejercicio6() {
        int[] lista1 = new int[12];
        int[] lista2 = new int[12];
        int i;
        int j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Llena la lista 1 con 12 números:");
        for (i = 0; i < 12; i++) {
            lista1[i] = scan.nextInt();
        }
        System.out.println("Llena la lista 2 con 12 números:");
        for (i = 0; i < 12; i++) {
            lista2[i] = scan.nextInt();
        }
        for (i = 0; i < 12; i = i + 3) {
            for (j = 0; j < 3; j++) {
                System.out.println(lista1[i + j]);
            }
            for (j = 0; j < 3; j++) {
                System.out.println(lista2[i + j]);
            }
        }
    }

    public static void main(String[] args) {
        int opcion;
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Introduce una respuesta (1,2,3,4,5,6):");
            opcion = scan.nextInt();
        } while (opcion <= 0 && opcion > 6);

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
        }
    }

}
