package Unidimensional;

import java.util.*;

public class Séptimo {

	public static void main(String[] args) {
		/* Programa que cree un array del
		 * tamaño deseado por el usuario para almacenar
		 * nombres de personas. A continuación pedirá
		 * al usuario un nombre y comprobará si dicho
		 * nombre está en el array. En caso afirmativo
		 * dará su posición. En caso negativo sacará un
		 * mensaje para advertirlo.*/

		String nombres[], nombre="";
		int num;
		boolean esta=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuantos nombres quieres introducir: ");
		num=sc.nextInt();
		nombres=new String[num];
		sc.nextLine();

		for (int i=0; i<nombres.length; i++) {
			System.out.println(i+1+" Introduce un nombre");
			nombres[i]=sc.nextLine();
		}
		
		System.out.println("Introduce un nombre para ver si está en el array: ");
		nombre=sc.nextLine();

		for (int i=0; i<nombres.length; i++) {
			if(nombre.equalsIgnoreCase(nombres[i])) {
				System.out.println(nombre+" está en la lista en la posición "+(i+1));
				esta=true;
			}
		}
		
		if(!esta) {
			System.out.println("No está en la lista");
		}
		sc.close();

	}

}