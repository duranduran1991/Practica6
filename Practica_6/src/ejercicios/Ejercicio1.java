package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * 1. Programa que lee una secuencia de 50 letras y escribe el número de
	 * veces que se repite la primera de ellas.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char Letra,PrimeraLetra =' ';
		int cont = 0,i;

		for (i = 0; i < 10; i++) {
			System.out.println("Escribe una letra");
			Letra = sc.next().charAt(0);
			if (i==0){
				PrimeraLetra=Letra;
			}
			if (Letra==PrimeraLetra){
				cont++;
			}
		}
		System.out.println(" La primera letra introducida es " + PrimeraLetra + " y se repite " + cont + " veces ");
	}
}