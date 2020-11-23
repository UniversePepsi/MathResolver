package com.pronoob;

import java.util.Scanner;

public class Opciones {
    private static final Scanner sc = new Scanner(System.in);
    private static int op;

    public static void ecuaciones() {
        double a, b, c;

        System.out.println("[#] Fórmula 1: ax + b = c" + "\n" + "[#] Fórmula 2: ax^2 + bx + c = 0");
        System.out.print("[*] Introduzca una opción: "); op = sc.nextInt();

        System.out.print("[*] Introduzca el valor de a: "); a = sc.nextDouble();
        System.out.print("[*] Introduzca el valor de b: "); b = sc.nextDouble();
        System.out.print("[*] Introduzca el valor de c: "); c = sc.nextDouble();
        System.out.print("[*] El valor de x es: ");

        if (op == 1) {
            System.out.println((c-b)/a);
        }
        else if (op == 2) {
            double discriminant = b*b-4*a*c;

            if (discriminant < 0) {
                System.out.println("NaN, NaN\n[!] La ecuacion no tiene raices reales");
            }
            else {
                System.out.printf("%.4f%s", (-b + Math.sqrt(discriminant)) / (2*a), ", ");
                System.out.printf("%.4f", (-b - Math.sqrt(discriminant)) / (2*a));
            }
        }
        else {
            System.err.println("[!] Error, el rango va del 1 al 2");
        }
    }

    public static void binomioAlCuadrado() {
        double a, b;

        System.out.println("[#] Fórmula 1: (a + bx)^2" + "\n" + "[#]: Fórmula 2: (a - bx)^2");
        System.out.print("[*]: Introduzca una opción: "); op = sc.nextInt();

        System.out.print("[*] Introduzca el valor de a: "); a = sc.nextDouble();
        System.out.print("[*] Introduzca el valor de b: "); b = sc.nextDouble();

        if (op == 1) {
            System.out.printf(getFormat(a, b), "[*] El cuadrado del binomio es: ", a*a,
                    " + ", 2*a*b, "x + ", b*b, "x^2");
        }
        else if (op == 2) {
            System.out.printf(getFormat(a, b), "[*] El cuadrado del binomio es: ", a*a,
                    " - ", 2*a*b, "x + ", b*b, "x^2");
        }
        else {
            System.err.println("[!] Error, el rango va del 1 al 2.");
        }
    }

    public static void areasYPerimetros() {
        System.out.println("[#] Fórmula 1: Área y perímetro de un rectangulo.");
        System.out.println("[#] Fórmula 2: Área y perímetro de un triangulo.");
        System.out.println("[#] Fórmula 3: Área y circunferencia de un circulo.");
        System.out.print("[*] Introduzca una opción: "); op = sc.nextInt();

        if (op == 1) {
            double largo, ancho;

            System.out.print("[*] Introduzca largo del rectangulo: "); largo = sc.nextDouble();
            System.out.print("[*] Introduzca ancho del rectangulo: "); ancho = sc.nextDouble();

            System.out.println("[*] El área del rectangulo es: " + (ancho * largo));
            System.out.println("[*] El perímetro del rectangulo es: " + (2 * (ancho + largo)));
        }
        else if (op == 2) {
            double a, b, c, perimetro;

            System.out.print("[*] Introduzca el lado 1 del triangulo: "); a = sc.nextDouble();
            System.out.print("[*] Introduzca el lado 2 del triangulo: "); b = sc.nextDouble();
            System.out.print("[*] Introduzca el lado 3 del triangulo: "); c = sc.nextDouble();
            perimetro = a + b + c;

            System.out.println("[*] El área del triangulo es: " + Math.sqrt(perimetro/2*(perimetro/2-a)*(perimetro/2-b)*(perimetro/2-c)));
            System.out.println("[*] El perimetro del triangulo es: " + perimetro);
        }
        else if (op == 3) {
            double r;

            System.out.print("[*] Introduzca el radio del circulo: "); r = sc.nextDouble();

            System.out.println("[*] El area del circulo es: " + (Math.PI*r*r));
            System.out.println("[*] La circunferencia del circulo es: " + (2*Math.PI*r));
        }
        else {
            System.err.println("[!] Error, el rango va del 1 al 3.");
        }
    }

    private static String getFormat(double a, double b) {
        String format = "";

        if (a == (int) a) format += "%s%.0f%s";
        else format += "%s%.2f%s";

        if (a != (int) a || b != (int) b) format += "%.2f%s";
        else format += "%.0f%s";

        if (b == (int) b) format += "%.0f%s";
        else format += "%.2f%s";

        return format;
    }
}
