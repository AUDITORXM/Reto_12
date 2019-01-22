package Bidimensionales;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/* Programa que cree un array bidimensional con el
		 * número de filas que desee el usuario
		 * (asegurarse de que el valor introducido es mayor que 1).
		 * A cada fila se le asignará como número de columnas
		 * un valor aleatorio entre 1 y 5, para después imprimir
		 * el array en forma matricial y obtener la suma de todos
		 * los elementos de cada fila. El array se rrellenará con
		 * valores aleatorios entre 1 y 10. */

		int array[][], fila;

		fila=pedirNum();
		array=crearArray(fila);
		array=rellenarArray(array);
		mostrarSuma(sumar(array));
		mostrarMatriz(array);


	}
	//=====================================================================

	public static int pedirNum() {
		//Pedir numero de filas para la matriz
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int num;
		do {
			System.out.println("Introduce de cuantas filas quieres que sea la matriz:");
			num=sc.nextInt();
		} while (num<1);
		return num;
	}
	//=====================================================================

	public static int randInt(int min, int max) {
		// Esto nos da un número entero aleatorio, max y min inclusive
		int rango=(max - min)+1;
		return (int)(Math.random()*rango)+min;

	}
	//=====================================================================

	public static int[][] crearArray(int fila) {
		int matriz[][];
		matriz=new int[fila][];
		for(int i=0; i<matriz.length; i++) {
			matriz[i]=new int [randInt(1,5)];
		}
		return matriz;
	}

	//=====================================================================

	public static int[][] rellenarArray(int[][] matriz) {
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j]=randInt(1, 10);
			}
		}
		return matriz;
	}
	//=====================================================================

	public static int[] sumar(int[][] matriz) {
		int sumaarray[]=new int[matriz.length];		
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				sumaarray[i]+=matriz[i][j];
			}
		}
		return sumaarray;
	}
	//=====================================================================

	public static void mostrarSuma(int[] suma) {
		for(int i=0; i<suma.length; i++)
		System.out.println("La suma es: "+suma[i]);
	}
	//=====================================================================

	public static void mostrarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j]>9) {
					System.out.print(matriz[i][j]+" ");
				}else {
					System.out.print(" "+matriz[i][j]+" ");
				}
			}
			System.out.println();
		}
	}	

}