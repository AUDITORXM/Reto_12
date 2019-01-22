package Bidimensionales;

public class Ejer6 {

	public static void main(String[] args) {
		/* Programa que permita crear un array de 10 elementos
		 * con valores aleatorios entre 1 y 100.
		 * A continuación mostrará en pantalla los valores
		 * generados. Ordenará el array utilizando el método
		 * de la burbuja y se visualizará el array ordenado. */

		int array[];

		array=crearArray();
		array=rellenarArray(array);
		System.out.println("Array sin ordenar:");
		mostrarArray(array);
		array=ordenarArrayBurbuja(array);
		System.out.println("Array ordenado:");
		mostrarArray(array);

	}
	//=====================================================================

	public static int[] crearArray() {
		int vector[];

		vector=new int[10];
		return vector;
	}
	//=====================================================================

	public static int randInt(int min, int max) {
		// Esto nos da un numero entero aleatorio, max y min inclusive
		int rango=(max - min)+1;
		return (int)(Math.random()*rango)+min;

	}
	//=====================================================================

	public static int[] rellenarArray(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=randInt(1, 100);
		}
		return vector;
	}
	//=====================================================================

	public static int[] ordenarArrayBurbuja(int[] vector) {
		int aux;
		for(int i=vector.length; i>0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(vector[j]>vector[j+1]) {
					aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
				}
			}
		}
		return vector;
	}
	//=====================================================================

	public static void mostrarArray(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

}