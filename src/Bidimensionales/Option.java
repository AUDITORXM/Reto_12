package Bidimensionales;

import javax.swing.JOptionPane;

public class Option {

	public static void main(String[] args) {
		// Sumar 2 n�meros que pida el usuario con ventanas.
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero: "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro n�mero: "));
		
		JOptionPane.showMessageDialog(null, "La suma es: "+(num1+num2));

	}

}