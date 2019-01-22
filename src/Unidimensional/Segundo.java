package Unidimensional;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		/* Crea un array con 10 valores introducidos
		 * por el usuario. Despu�s imprime el array.
		 * Obt�n la suma de todos sus elementos, el m�ximo
		 * valor de todos, la media aritm�tica de todos
		 * lo n�meros del array, para imprimirlos despu�s.*/

		Scanner sc=new Scanner(System.in);
		int[] num = new int[10];
		int suma=0, maximo;

		System.out.println("Introduce 10 n�meros");
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			suma+=num[i];
			System.out.println("Faltan "+(num.length-i-1)+" n�meros.");
		}
		
		System.out.println("Los valores del array son: ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		maximo=num[0];
		for(int i=0; i<num.length; i++) {
			if (num[i]>maximo) {
				maximo=num[i];
			}
		}

		System.out.println();
		System.out.println("La suma total es = "+suma);
		System.out.println("El mayor n�mero introducido es "+maximo);
		System.out.println("La media es = "+(suma/10));
		sc.close();
	}

}