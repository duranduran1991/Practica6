package practica6_;

import java.util.*;

public class Ejericicio7 {
	/* 7. Programa que determina cuantas cifras tiene un n�mero */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Anota un numero");
		num=sc.nextInt();
		System.out.println("El n�mero " + num + " tiene " + Integer.toString(num).length() + " cifras");
	}

}
