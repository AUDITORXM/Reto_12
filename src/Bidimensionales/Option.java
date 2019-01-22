package Bidimensionales;

import javax.swing.JOptionPane;

public class Option {

	public static void main(String[] args) {
		// Sumar 2 números que pida el usuario con ventanas.
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
		
		JOptionPane.showMessageDialog(null, "La suma es: "+(num1+num2));

	}

}