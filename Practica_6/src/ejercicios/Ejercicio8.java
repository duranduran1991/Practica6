package practica6_;

import java.util.*;

public class Ejercicio8 {
	/*
	 * Se desea conocer el luckynumber de cualquier persona. El n�mero de la
	 * suerte se consigue reduciendo la fecha de nacimiento a un n�mero de un
	 * solo d�gito. 16/08/1973->16+8+1973=1997->1+9+9+7=26->2+6=8
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, a�o, num2, num3, total, cont = 0, i, a, suma = 0, suma1 = 0;
		System.out.println("Anota el dia de nacimiento");
		dia = sc.nextInt();
		System.out.println("Anota el mes de nacimiento");
		mes = sc.nextInt();
		System.out.println("Anota el a�o de nacimiento");
		a�o = sc.nextInt();
		total = dia + mes + a�o;
		num2 = total;
		System.out.println(" El primer calculo es: " + total);
		System.out.println("------------------------------");
		while (num2 >= 1) {
			num2 = num2 / 10;
			cont++;

		}
		num2 = total;
		for (i = cont; cont > 1; cont--) {
			a = num2 % 10;
			num2 = num2 / 10;
			suma = suma + a;
			if (num2 < 10) {
				suma = suma + num2;
				System.out.println(" La suma es del primer calculo es: " + suma);
				System.out.println("------------------------------------------");
				break;

			}
		}
		num3 = suma;
		for (i = cont; cont > 1; cont--) {
			a = num3 % 10;
			num3 = num3 / 10;
			suma1 = suma1 + a;
			if (num3 < 10) {
				suma1 = suma1 + num3;
				System.out.println(" Tu numero de la suerte es: " + suma1);
				System.out.println("------------------------------------");
				break;
			}

		}
	}
}