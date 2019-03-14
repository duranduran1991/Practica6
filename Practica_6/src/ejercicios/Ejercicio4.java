package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Hacer un programa en el que se simula la compra de entradas en el museo
	 * de la siguiente forma: Por cada grupo que llega se anota el n�mero de
	 * adultos y el n�mero de ni�os y si se aplica tarifa reducida o no. Con
	 * esta informaci�n se calcula el importe total de las entradas de cada
	 * grupo y se muestra por pantalla. El programa termina cuando se hayan
	 * recaudado m�s de 100 euros. Mostrar al final el n�mero de entradas del
	 * grupo que m�s entradas ha comprado.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Adultos, Ni�os;
		char ReducidaAdultos, ReducidaNi�os;
		double RecaudadoGrupo = 0, TotalRecaudado = 0;
		double EntradasTotales = 0, NumEntradas = 0;
		int j = 1;
		double cont = 0;
		do {
			
			System.out.println(" Anota el numero de adultos del grupo " + j);
			Adultos = sc.nextDouble();
			cont = cont + Adultos;
			System.out.println(" �Se aplica tarifa reducida para el grupo de adultos? (s) o (n)");
			sc.nextLine();
			ReducidaAdultos = sc.nextLine().charAt(0);
			if (ReducidaAdultos == 's') {
				Adultos = Adultos * 2;
			} else
				Adultos = Adultos * 3;
			System.out.println(" Anota el numero de ni�os del grupo: " + j);
			Ni�os = sc.nextDouble();
			cont = cont + Ni�os;
			System.out.println(" �Se aplica tarifa reducida para el grupo de ni�os? (s) o (n)");
			sc.nextLine();
			ReducidaNi�os = sc.nextLine().charAt(0);
			if (ReducidaNi�os == 's') {
				Ni�os = Ni�os * 1.2;
			} else
				Ni�os = Ni�os * 2;
			RecaudadoGrupo = Adultos + Ni�os;

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
