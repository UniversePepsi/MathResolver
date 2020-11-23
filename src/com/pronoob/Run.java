package com.pronoob;

import java.util.Locale;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("[===========================================]");
        System.out.println("[*] 1.- Ecuaciónes. \n[*] 2.- Cuadrado de un binomio. \n[*] 3.- Áreas y Perímetros");
        System.out.print("[*] Introduzca una opción: ");

        switch (sc.nextInt()) {
            case 1 -> Opciones.ecuaciones();
            case 2 -> Opciones.binomioAlCuadrado();
            case 3 -> Opciones.areasYPerimetros();
            default -> System.err.println("[!] Error, el rango va del 1 al 3");
        }
    }
}
