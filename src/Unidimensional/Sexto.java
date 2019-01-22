package Unidimensional;

import java.util.*;

public class Sexto {

	public static void main(String[] args) {
		/* Realiza un programa que cree un array
		 * de 10 números enteros introducidos por el usuario.
		 * Después multiplicará por 2 cada elemento del array,
		 * dejando en el mismo el resultado, para después
		 * mostrar el contenido del array resultante en pantalla.
		 * Para terminar sumará todos los elementos que se
		 * encuentren en las posiciones pares del array,
		 * mostrando el resultado de dicha suma.*/

		Scanner sc=new Scanner(System.in);
		int[] num = new int[10];
		int suma=0;

		System.out.println("Introduce 10 números");
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+". ");
			num[i]=sc.nextInt();
			num[i]*=2;
			if (num[i]%2==0) {
				suma+=num[i];
			}
		}
		
		System.out.println("Los valores del array multiplicados son: ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		for(int i=0; i<num.length; i++) {
			if (i%2==0) {
				suma+=num[i];
			}
		}
		System.out.println("\nLa suma de los números de las posiciones pares es "+suma);
		sc.close();
	}
}