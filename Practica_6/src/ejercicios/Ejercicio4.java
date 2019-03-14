package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Hacer un programa en el que se simula la compra de entradas en el museo
	 * de la siguiente forma: Por cada grupo que llega se anota el número de
	 * adultos y el número de niños y si se aplica tarifa reducida o no. Con
	 * esta información se calcula el importe total de las entradas de cada
	 * grupo y se muestra por pantalla. El programa termina cuando se hayan
	 * recaudado más de 100 euros. Mostrar al final el número de entradas del
	 * grupo que más entradas ha comprado.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Adultos, Niños;
		char ReducidaAdultos, ReducidaNiños;
		double RecaudadoGrupo = 0, TotalRecaudado = 0;
		double EntradasTotales = 0, NumEntradas = 0;
		int j = 1;
		double cont = 0;
		do {
			
			System.out.println(" Anota el numero de adultos del grupo " + j);
			Adultos = sc.nextDouble();
			cont = cont + Adultos;
			System.out.println(" ¿Se aplica tarifa reducida para el grupo de adultos? (s) o (n)");
			sc.nextLine();
			ReducidaAdultos = sc.nextLine().charAt(0);
			if (ReducidaAdultos == 's') {
				Adultos = Adultos * 2;
			} else
				Adultos = Adultos * 3;
			System.out.println(" Anota el numero de niños del grupo: " + j);
			Niños = sc.nextDouble();
			cont = cont + Niños;
			System.out.println(" ¿Se aplica tarifa reducida para el grupo de niños? (s) o (n)");
			sc.nextLine();
			ReducidaNiños = sc.nextLine().charAt(0);
			if (ReducidaNiños == 's') {
				Niños = Niños * 1.2;
			} else
				Niños = Niños * 2;
			RecaudadoGrupo = Adultos + Niños;

			TotalRecaudado = TotalRecaudado + RecaudadoGrupo;

			System.out.println(" El grupo numero : " + j + " ha recaudado un total de: " + RecaudadoGrupo);
			j++;

			if (cont > NumEntradas) {
				NumEntradas = cont;
				
			}
			cont = 0;
		} while (TotalRecaudado < 100);

		System.out.println("--------------------------------------------------");
		System.out.println(" El total recaudado ha sido de: " + TotalRecaudado);
		System.out.println("---------------------------------------------------");
		System.out.println(" El grupo que mas entradas ha comprado, con un total de: " + NumEntradas);

	}

}
