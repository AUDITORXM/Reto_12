package Unidimensional;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		/* Crea un array con 10 valores introducidos
		 * por el usuario. Después imprime el array.
		 * Obtén la suma de todos sus elementos, el máximo
		 * valor de todos, la media aritmética de todos
		 * lo números del array, para imprimirlos después.*/

		Scanner sc=new Scanner(System.in);
		int[] num = new int[10];
		int suma=0, maximo;

		System.out.println("Introduce 10 números");
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			suma+=num[i];
			System.out.println("Faltan "+(num.length-i-1)+" números.");
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
		System.out.println("El mayor número introducido es "+maximo);
		System.out.println("La media es = "+(suma/10));
		sc.close();
	}

}