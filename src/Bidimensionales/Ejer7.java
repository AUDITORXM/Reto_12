package Bidimensionales;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		/* Realiza un programa que cree un array
		 * unidimensional con 5 nombres introducidos
		 * por el usuario y a continuación ordene el array
		 * por el método de la burbuja, para después mostrar
		 * en pantalla el array y comprobar que los nombres
		 * están ordenados. */

		String nombre[]=crearArrayNombres();
		nombre=rellenarArray(nombre);
		System.out.println("Array sin ordenar:");
		mostrar(nombre);
		nombre=ordenarArrayBurbuja(nombre);
		System.out.println("Array ordenado:");
		mostrar(nombre);
		
	}
	//=====================================================================

	public static String[] crearArrayNombres() {
		String nombre[]=new String[5];
		return nombre;
	}
	//=====================================================================

	public static String[] rellenarArray(String[] nombre) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(i+1+" Introduce nombre:");
			nombre[i]=sc.nextLine();
		}
		return nombre;
	}
	//=====================================================================

	public static String[] ordenarArrayBurbuja(String[] nombre) {
		String aux;
		for(int i=nombre.length; i>0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(compararStrings(nombre[j], nombre[j+1])) {
					aux=nombre[j];
					nombre[j]=nombre[j+1];
					nombre[j+1]=aux;
				}
			}
		}
		return nombre;
	}
	//=====================================================================

	public static boolean compararStrings(String nombre1, String nombre2) {
		boolean antes=false;

		if(nombre1.charAt(0)>nombre2.charAt(0)) {
			antes=true;
		}else if(nombre1.charAt(0)==nombre2.charAt(0)){
			if (nombre1.length()>nombre2.length()) {
				for (int i = 1; i < nombre2.length() && antes==false; i++) {
					if(nombre1.charAt(0)>nombre2.charAt(0)) {
						antes=true;
					}
				}
				antes=true;
			} else {
				for (int i = 1; i < nombre1.length() && antes==false; i++) {
					if(nombre1.charAt(0)>nombre1.charAt(0)) {
						antes=true;
					}
				}
			}
		}
		return antes;
	}
	//=====================================================================
	
	public static void mostrar(String[] nombre) {
		for (int i = 0; i < nombre.length; i++) {
			System.out.print(nombre[i]+" ");
		}
		System.out.println();
	}

}