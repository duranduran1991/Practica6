package ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
	/*2. Leer números de teclado hasta que la suma de todos ellos sea mayor a 100, y decir si se ha
	anotado algún cero.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num;
		int suma=0;
		int cont=0;
		while(suma<=100) {
			System.out.println(" Introduce un numero: ");
			num=sc.nextInt();
			suma=suma+num;
			if (num==0){
				cont++;
			}
		}
		System.out.println(" Se ha llegado a 100, Fin del programa ");
		System.out.println("----------------------------------------");
		System.out.println(" Se ha introducido el numero 0: " + cont + " veces ");
	}

}
