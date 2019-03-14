package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * En unos multicines se están proyectando dos películas en dos salas distintas.
	 * Cada persona que llega compra varias entradas para la misma película.
	 * Realizar un programa en el que se anota por cada persona que llega a la
	 * taquilla el número de sala y el número de entradas que compra para esa sala,
	 * el programa finaliza al anotar la sala 0. Mostrar el número total de entradas
	 * vendidas y decir para que sala se han vendido más entradas. Decir además si
	 * ha habido alguien que haya comprado más de 10 entradas.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Entradas = 0, Sala=0, Sala1 = 0, Sala2 = 0;
		int TotalEntradas = 0, j = 0,EntradasSala1=0,EntradasSala2=0;

		do {
			System.out.println("¿La pelicula se proyectará en la sala (1) o (2)?");
			Sala = sc.nextInt();
			if (Sala==0) {
				break;
			}
			System.out.println("¿Cuantas entradas vas a comprar para la sala numero " + Sala + "?");
			Entradas = sc.nextInt();
			TotalEntradas = TotalEntradas + Entradas;
			 if (Sala==1) {
				EntradasSala1=Entradas+EntradasSala1;
			}else {
				EntradasSala2=Entradas+EntradasSala2;
			}
			if (Entradas > 10) {
				j++;
			}

		} while (Sala != 0);
		System.out.println(" El numero total de entradas vendidas es: " + TotalEntradas);
		System.out.println("***********************************************************");
		if (EntradasSala1 > EntradasSala2) {
			System.out.println(" La sala que mas ha vendido entradas es la numero 1 con un total de: " + EntradasSala1);
		} else {
			System.out.println(" La sala que mas ha vendido entradas es la numero 2 con un total de: " + EntradasSala2 );
		}
		System.out.println("***********************************************************");
		System.out.println(" Personas que han comprado mas de 10 entradas: " + j);
		System.out.println("***********************************************************");

	}

}
