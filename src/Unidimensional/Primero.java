package Unidimensional;

public class Primero {

	public static void main(String[] args) {
		/* Crea un array con 10 números aleatorios entre 1 y 100.
		 * Después imprime en pantalla dicho array.
		 * Contabiliza el total de pares que hay en el array y
		 * el total de impares y muestra en pantalla dichos totales.*/

		int[] num = new int[10];
		int par=0;
		
		for(int i=0; i<num.length; i++) {
			num [i]=(int) (Math.random()*100+1);
			if(num[i]%2==0) {
				par++;
			}
		}
		System.out.println("Los valores del array son: ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("Se han introducido "+par+" números pares.");
		System.out.println("Se han introducido "+(num.length-par)+" números impares.");

	}

}