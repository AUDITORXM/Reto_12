package Bidimensionales;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
//		Programa que cree un array bidimensional
//		del mismo n�mero de filas que de columnas
//		(dicho n�mero se le pedir� al usuario y se validar�
//		que sea mayor que 1). Los valores para el array
//		ser�n introducidos por el usuario. Se imprimir� en pantalla
//		el array generado en forma matricial y se mostrar� un
//		mensaje diciendo si se trata de un array sim�trico o no.
//		Un array es sim�trico si doblando por la diagonal principal,
//		los valores que se solapan coinciden.

		int num, array[][];
		boolean simetria;
		
		System.out.print("De cuanto quieres que sea la matriz: ");
		num=pedirNum();
		array=crearArray(num);
		array=rellenarArray(array);
		simetria=simetrico(array);
		mostrarMatriz(array);
		responderPregunta(simetria);
		

	}
	//=====================================================================

	public static int pedirNum() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Introduce numero:");
			num=sc.nextInt();
		} while (num<1);
		return num;
	}
	//=====================================================================

	public static int[][] crearArray(int num) {
		int matriz[][];
		
		matriz=new int[num][num];
		return matriz;
	}
	//=====================================================================
	
	public static int[][] rellenarArray(int[][] matriz) {
		int cont=1;
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(cont+" ");
				matriz[i][j]=pedirNum();
				cont++;
			}
		}
		return matriz;
	}
	//=====================================================================
	
	public static boolean simetrico(int[][] matriz) {
		boolean simetria=true;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j]!=matriz[j][i]) {
					simetria=false;
				}
			}
		}
		return simetria;
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
	
	public static void responderPregunta(boolean simetria) {
		if(simetria) {
			System.out.println("El array es sim�trico");
		}else {
			System.out.println("El array no es sim�trico");
		}
	}

}