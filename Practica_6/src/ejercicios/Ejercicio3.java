package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * En una empresa de fruta se seleccionan fresas en 3 categorías dependiendo de
	 * su calibre: A (de 1 a 3 cm), B (de 3 a 5 cm), C(más de 5). Ir anotando el
	 * grosor de cada fresa hasta anotar 0. Decir cuántas hay de cada categoría y si
	 * no ha habido fresas de alguna categoría.
	 */
	public static void main(String[] args) {

		int numFresas = 0;
		int cont1 = 0, cont2 = 0, cont3 = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(" Anota el grosor de las fresas: ");
			numFresas = sc.nextInt();
			if (numFresas >= 1 && numFresas <= 3) {
				cont1++;
			}
			if (numFresas > 3 && numFresas <= 5) {
				cont2++;
			}
			if (numFresas > 5) {
				cont3++;
			}
		} while (numFresas != 0);

		System.out.println(" La cantidad de fresas finas son : " + cont1);
		System.out.println(" La cantidad de fresas normales son : " + cont2);
		System.out.println(" La cantidad de fresas gruesas son : " + cont3);
		if(cont1==0 || cont2==0 || cont3==0) {
			System.out.println(" No hay fresas en la categoria: " + " Finas: "+ cont1 + " Normales: " + cont2 + " Gruesas: " + cont3);
		}
		
		
	}
}
