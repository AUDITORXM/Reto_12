package Unidimensional;

import java.util.*;

public class S�ptimo {

	public static void main(String[] args) {
		/* Programa que cree un array del
		 * tama�o deseado por el usuario para almacenar
		 * nombres de personas. A continuaci�n pedir�
		 * al usuario un nombre y comprobar� si dicho
		 * nombre est� en el array. En caso afirmativo
		 * dar� su posici�n. En caso negativo sacar� un
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
		
		System.out.println("Introduce un nombre para ver si est� en el array: ");
		nombre=sc.nextLine();

		for (int i=0; i<nombres.length; i++) {
			if(nombre.equalsIgnoreCase(nombres[i])) {
				System.out.println(nombre+" est� en la lista en la posici�n "+(i+1));
				esta=true;
			}
		}
		
		if(!esta) {
			System.out.println("No est� en la lista");
		}
		sc.close();

	}

}