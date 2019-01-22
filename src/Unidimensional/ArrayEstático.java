package Unidimensional;

import java.util.*;

/* Realiza un programa que cree un array
 * de 10 n�meros enteros introducidos por el usuario.
 * Despu�s multiplicar� por 2 cada elemento del array,
 * dejando en el mismo el resultado, para despu�s
 * mostrar el contenido del array resultante en pantalla.
 * Para terminar sumar� todos los elementos que se
 * encuentren en las posiciones pares del array,
 * mostrando el resultado de dicha suma.*/

public class ArrayEst�tico {

	public static void main(String[] args) {
		final int NUM=10;
		final int MULT=2;
		int suma;
		int array[];
		array=crearArray(NUM);
		array=multiArray(array, MULT, NUM);
		imprimir(array, NUM);
		suma=sumar(array, NUM);
		System.out.println("La suma total es: "+suma);
	}

	public static int[] crearArray(int num) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		int array[]=new int[num];
		System.out.println("Introduce 10 n�meros");

		for(int i=0; i<array.length; i++) {
			num=sc.nextInt();
			System.out.println("Faltan "+(9-i)+" n�meros");
			array[i]=num;
		}

		return array;
	}
	public static int[] multiArray(int[] array, int num, int tama�o) {
		for (int i=0; i<tama�o; i++) {
			array[i]*=num;
		}
		return array;
	}
	public static void imprimir(int[] array, int tama�o) {
		System.out.println("Elementos del Array:\n");
		for(int i=0; i<tama�o; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static int sumar(int[] array, int tama�o) {
		int suma=0;
		for (int i=0; i<tama�o; i++) {
			if(i%2==0) {
				suma+=array[i];
			}
		}
		return suma;
	}
}