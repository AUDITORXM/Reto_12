package Unidimensional;

public class Quinto {

	public static void main(String[] args) {
		/* ¿Y al ejecutar lo siguiente? */

		 //Declacion del Array
	      int vector[];
	      //Creacion del array
	      vector = new int[5];
	      //Relleno de datos
	      for (int i=0;i< vector.length; i++)
	        vector[i] = i+1;
	      //Muestra los datos del array
	      for (int i=0;i< vector.length; i++)
	        System.out.println(vector[i]);
	}

}