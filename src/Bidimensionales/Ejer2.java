package Bidimensionales;

public class Ejer2 {

	public static void main(String[] args) {
		/* Programa que cree una matriz bidimensional de
		 * 4X4 con valores aleatorios entre 1 y 100.
		 * A continuación se visualizará en forma matricial.
		 * Además se obtendrá la suma de los elementos que
		 * se encuentran por encima de la diagonal principal
		 * y el producto de los elementos que se encuentran
		 * por debajo. */

		int m[][], suma, producto;

		m=crearArray();
		rellenarArray(m);
		suma=sumar(m);
		producto=multiplicar(m);
		mostrarMatriz(m);
		mostrarSumPro(suma, producto);


	}
	//=====================================================================

	public static int[][] crearArray() {
		int matriz[][];
		matriz=new int[4][4];
		return matriz;
	}
	//=====================================================================

	public static int randInt(int min, int max) {
		// Esto nos da un numero entero aleatorio, max y min inclusive
		int rango=(max - min)+1;
		return (int)(Math.random()*rango)+min;

	}
	//=====================================================================

	public static void rellenarArray(int[][] matriz) {
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j]=randInt(1, 100);
			}
		}
	}
	//=====================================================================

	public static int sumar(int[][] matriz) {
		// Sumar los numeros que esten arriba de la diagonal
		int suma=0;
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(i<j) {
					suma+=matriz[i][j];
				}
			}
		}
		return suma;
	}
	//=====================================================================

	public static int multiplicar(int[][] matriz) {
		// Multiplicar los numeros que esten abajo de la diagonal
		int producto=1;
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(i>j) {
					producto*=matriz[i][j];
				}
			}
		}
		return producto;
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
	//=====================================================================

	public static void mostrarSumPro(int suma, int producto) {
		// Mostrar la suma y el producto
		System.out.println("La suma es: "+suma);
		System.out.println("El producto es: "+producto);
	}
}