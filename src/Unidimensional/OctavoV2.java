package Unidimensional;

import java.util.*;

public class OctavoV2 {

	public static void main(String[] args) {
		/* Programa que pida al usuario una frase
		 * y una letra y a continuación diga el número
		 * de veces que aparece la letra en la frase.
		 * Repetir el proceso con todas las letras que
		 * el usuario desee, hasta que teclee un asterisco.
		 * Además contabilizará el número de letras tratadas,
		 * mostrando el resultado en pantalla.*/

		Scanner sc=new Scanner(System.in);
		String frase;
		char letra;
		char frasearray[];
		int cont=0, tratadas=0;

		System.out.print("Introduce una frase: ");
		frase=sc.nextLine();
		frasearray=frase.toCharArray();
		System.out.print("Introduce una letra: ");
		letra=sc.next().charAt(0);

		while(letra!='*'){
			cont=0;
			for(int i=0;i<frasearray.length;i++) {
				if(frasearray[i]==letra) {
					cont++;
				}
			}
			System.out.println("La cantidad de "+letra+" introducidos es "+cont);
			System.out.print("Introduce una letra: ");
			letra=sc.next().charAt(0);
		}
		System.out.println("El total de letras tratadas es "+tratadas);
		System.out.println("Se acabó el Programa");
		sc.close();

	}

}