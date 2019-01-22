package Bidimensionales;

public class Ejer1 {

	public static void main(String[] args) {
		/* Programa que cree una matriz bidimensional
		de 5X5 cuya diagonal principal contenga 1 y el resto 0.
		Una vez creada la matriz se visualizará en forma matricial. */

		int [][]matriz;
		final int N=5;
		int i,j;
		
		matriz=new int [N][N];

		for(i=0; i<N; i++)
			for(j=0; j<N; j++)
				if(i==j){
					matriz[i][j]=1;
				}else
					matriz[i][j]=0;	
		
		for(i=0;i<matriz.length;i++) {
            		for(j=0;j<matriz[i].length;j++) {
               		 System.out.print(matriz[i][j]+" ");
            		}
            		System.out.println();
		}
	}
}