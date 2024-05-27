package com.revision;

import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    String numeroIngresado = sc.nextLine();
	   
	    if (esNumeroAfortunado(numeroIngresado)) {
            System.out.println("El " + numeroIngresado + " es un número afortunado.");
        } else {
            System.out.println("El " + numeroIngresado + " no es un número afortunado.");
        }
    }

    public static boolean esNumeroAfortunado(String numero) {
        int longitud = numero.length();
        int sumaAfortunados = 0, sumaNoAfortunados = 0;

        for (int i = 0; i < longitud; i++) {
            int digito = Character.digit(numero.charAt(i), 10);
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                sumaAfortunados++;
            } else {
                sumaNoAfortunados++;
            }
        }

        return sumaAfortunados > sumaNoAfortunados;
    }
	   

}
