package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Calcular el precio de la entrada a un parque de atracciones teniendo en
	 * cuenta lo siguiente: Hay dos tarifas, reducida 16 euros (para menores de 7
	 * años y mayores de 65) y normal 25 euros (para el resto). Todos los mayores de
	 * 18 años pueden sacar además ticket para ver la actuación de un grupo de
	 * teatro con un coste adicional de 3 euros. Para realizar el programa mostrar
	 * un menú con las opciones  Comprar entrada: leer la edad de la persona y en
	 * el caso de que sea mayor de edad preguntar si desea ver el teatro  Cerrar
	 * taquilla: se muestra el importe total recaudado y se acaba el programa
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Entrada = 0, EntradaCompleta = 0, TarifaReducida = 16, TarifaNormal = 25, Actuacion = 3;
		int edad, TotalRecaudado = 0, op;
		char Adicional;

		System.out.println("Bienvenido al parque de atracciones");
		System.out.println("***********************************");
		System.out.println("Seleccione una opcion del menu.");

		do {
			System.out.println("1 - Comprar entrada");
			System.out.println("***************");
			System.out.println("2 - Cerrar taquilla");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("¿Cual es tu edad?");
				System.out.println("-----------------");
				edad = sc.nextInt();
				if (edad < 7 || edad > 65) {
					Entrada = TarifaReducida;
				} else {
					Entrada = TarifaNormal;
				}
				if (edad >= 18) {
					System.out.println("¿Quieres comprar el ticket para la actuacion con un coste "
							+ "de 3 euros adicionales sobre la entrada (s)/(n)");
					sc.nextLine();
					Adicional = sc.nextLine().charAt(0);
					if (Adicional == 's' || Adicional == 'S') {
						EntradaCompleta = TarifaNormal + Actuacion;
					} else {
						EntradaCompleta = TarifaNormal;
					}

				}
				 System.out.println("El precio de tu entrada es : "+EntradaCompleta);
				TotalRecaudado = TotalRecaudado + EntradaCompleta;
				break;
			case 2:
				System.out.println(" El importe total recaudado: " + TotalRecaudado);

			}
		} while (op != 2);

	}

}
