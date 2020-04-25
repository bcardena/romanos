package com.co.edu.udea;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("Ingrese un número del 1 al 30");
        Scanner lectura = new Scanner(System.in);
        int numero = Integer.valueOf(lectura.nextLine());
        Conversor conversor = new Conversor();
        System.out.println("El número " + numero + " Convertido a romano es: " +
                conversor.convertirARomano(numero));
    }
}
