package Bidimensionales;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/* Programa que cree un array con los 10 nombres
		 * de los 10 montañeros de un club de montaña.
		 * Los nombres son sabidos por el programador y
		 * se pondrán directamente en el array. Se le pedirán
		 * al usuario las 3 altitudes más altas realizadas por
		 * cada uno de los montañeros para almacenarlas en un
		 * array bidimensional. Se obtendrá en un array
		 * unidimensional la media de las tres cimas de cada montañero.
		 * Por último se obtendrá la media de los 10 montañeros y
		 * se mostrará en pantalla dicha media.*/

		String alpinistas[];
		int alturas[][];
		float medias[];
		
		alpinistas=crearArrayAlpinista();
		alturas=crearArrayAltura();
		alturas=rellenarArrayAltura(alturas, alpinistas);
		medias=crearArrayMedia();
		medias=sacarMedia(alturas, medias);
		mostrarAlpinistaMedia(alpinistas, medias);
		mediaTotal(medias);

	}
	//=====================================================================
	
	public static String[] crearArrayAlpinista() {
		String alpinistas[]={"Oscar Cadiach", "Ferrán Latorre", "Azim Gheychisaz", "Peter Hámor",
							"Romano Benet", "Nives Meroi", "Radek Jaroš", "Jorge Egocheaga",
							"Carlos Pauner", "Kim Chang-Ho"};
		return alpinistas;
	}
	//=====================================================================
	
	public static int[][] crearArrayAltura(){
		int array[][], montañeros=10, alturas=3;
		
		array=new int[montañeros][alturas];
		return array;
	}
	//=====================================================================
	
	public static int[][] rellenarArrayAltura(int[][] array, String[] alpinista) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 3 alturas para cada montañero");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(alpinista[i]+" altura "+(j+1));
				array[i][j]=sc.nextInt();
			}
		}
		sc.close();
		return array;
	}
	//=====================================================================
	
	public static float[] crearArrayMedia() {
		float media[];
		
		media=new float[10];
		return media;
	}
	//=====================================================================
	
	public static float[] sacarMedia(int[][] array, float[] media) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				media[i]+=array[i][j];
			}
			media[i]/=3;
		}
		return media;
	}
	//=====================================================================
	
	public static void mostrarAlpinistaMedia(String[] alpinista, float[] media) {
		for (int i = 0; i < media.length; i++) {
			System.out.println("La media de "+alpinista[i]+" es de "+media[i]+" metros");
		}
	}
	//=====================================================================
	public static void mediaTotal(float[] media) {
		float mediaTotal=0;
		
		for (int i=0; i<media.length; i++) {
			mediaTotal+=media[i];
		}
		System.out.println("La media total es: "+(mediaTotal/10));
	}
}