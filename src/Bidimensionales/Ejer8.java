package Bidimensionales;

public class Ejer8 {

	public static void main(String[] args) {
		/* Realiza un programa que cree un array bidimensional
		 * de 5 filas y 3 columnas, rellenado las casillas
		 * con la suma de la fila y columna de cada una de las
		 * mismas. Imprime el array en forma matricial y después
		 * obtén en pantalla el resultado de la suma de cada fila
		 * y el resultado de la suma de cada columna. Suma también
		 * el total de todos los totales de las filas y suma todos
		 * los totales de las columnas. Muestra dichos totales y
		 * comprueba que coinciden. */

		int array[][], fila[], columna[], sumafila, sumacolumna;

		array=crearArray();
		array=rellenarArray(array);
		System.out.println("Array unidimensional:");
		mostrarMatriz(array);

		fila=sumarFilas(array);
		System.out.print("La suma de las filas son: ");
		mostrarArraydeSumas(fila);

		columna=sumarColumnas(array);
		System.out.print("La suma de las columnas son: ");
		mostrarArraydeSumas(columna);

		sumafila=sumarTotalFilas(fila);
		System.out.print("La suma total de los elementos de la fila: ");
		mostrarSumadeTotales(sumafila);

		sumacolumna=sumarTotalColumnas(columna);
		System.out.print("La suma total de los elementos de las columnas: ");
		mostrarSumadeTotales(sumacolumna);
		
		compararArray(sumafila, sumacolumna);


	}
	//=================================================================
	public static int[][] crearArray() {
		int array[][];

		array=new int[5][3];
		return array;
	}
	//=================================================================
	public static int[][] rellenarArray(int[][] array) {
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				array[i][j]+=i+j;
			}
		}
		return array;
	}
	//=================================================================
	public static void mostrarMatriz(int[][] array) {
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");				
			}
			System.out.println();
		}
	}
	//=================================================================
	public static int[] sumarFilas(int[][] array){
		int fila[];

		fila=new int[array[0].length];
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				fila[j]+=array[i][j];
			}
		}
		return fila;
	}
	//=================================================================
	public static int[] sumarColumnas(int[][] array) {
		int columna[];

		columna=new int[array.length];
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				columna[i]+=array[i][j];
			}
		}
		return columna;
	}
	//=================================================================
	public static int sumarTotalFilas(int[] filas) {
		int totalfila=0;

		for (int i=0; i<filas.length; i++) {
			totalfila+=filas[i];
		}
		return totalfila;
	}
	//=================================================================
	public static int sumarTotalColumnas(int[] columnas) {
		int totalcolumna=0;

		for (int i = 0; i<columnas.length; i++) {
			totalcolumna+=columnas[i];
		}
		return totalcolumna;
	}
	//=================================================================
	public static void mostrarArraydeSumas(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	//=================================================================
	public static void mostrarSumadeTotales(int suma) {
		System.out.println(suma);
	}
	//=================================================================
	public static void compararArray(int sumaF, int sumaC) {
		if (sumaF == sumaC) {
			System.out.println("La suma de las filas y las columnas son equivalentes");
		}else {
			System.out.println("La suma de las filas y las columnas no son equivalentes");
		}
	}

}