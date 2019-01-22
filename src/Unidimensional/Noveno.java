package Unidimensional;

import java.util.*;

public class Noveno {

	public static void main(String[] args) {
		/* Programa que cree un array con 10 nombres
		 * que ser�n introducidos por el usuario y
		 * obtenga el nombre de mayor longitud.
		 * Si hubiera varios con la misma longitud se
		 * sacar�n todos ellos. Tambi�n se imprimir�
		 * el valor de la longitud m�xima.*/

		 Scanner sc=new Scanner(System.in);
		 String[] nombres=new String[10];
		 int longitud=0;
		 
		 for(int i=0; i<nombres.length; i++) {
			 System.out.print((i+1)+") Introduce un nombre: ");
			 nombres[i]=sc.nextLine();
			 if(nombres[i].length()>longitud) {
				 longitud=nombres[i].length();
			 }
		 }
		 for(int i=0; i<nombres.length; i++) {
			 if (nombres[i].length()==longitud) {
				 System.out.println(nombres[i]+" tiene la misma longitud");
			 }
		 }
		 System.out.print("La mayor longitud es: "+longitud);
		 sc.close();

	}
}