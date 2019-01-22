package Unidimensional;

import java.util.*;

public class NovenoV2 {

	public static String[] crearArray(int TAM)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String nom[]=new String [TAM];
		System.out.println("Introduce "+ TAM + " nombres.");
		for(int i=0; i<nom.length;i++){
			nom[i]=sc.nextLine();
		}
		return nom;
	}

	public static int calculaLongMax(String [] nom){
		int max;
		max=nom[0].length();
		for(int x=1;x<nom.length;x++){
			if(nom[x].length()>max)
				max=nom[x].length();
		}

		return max;
	}

	public static void muestraLongitud(String [] nom, int max){
		System.out.println("Los nombres o el nombre con más caracteres son: ");
		for(int i=0;i<nom.length;i++){
			if(max==nom[i].length())
				System.out.println(nom[i]);
		}
	}

	public static void main(String[] args) {

		final int LONG = 4;

		String []nombres;

		int longitud;

		nombres = crearArray(LONG);
		longitud = calculaLongMax(nombres);
		muestraLongitud(nombres, longitud);

	}

}
