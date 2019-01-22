package Bidimensionales;

import java.util.Scanner;

public class Menu {

		public static int pedirNumero() {
			int num;

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			return num;
		}

		public static int suma(int num1, int num2) {
			return num1+num2;
		}

		public static int resta(int num1, int num2) {
			return num1-num2;
		}

		public static int multiplicacion(int num1, int num2) {
			return num1*num2;
		}

		public static int division(int num1, int num2) {
			int total=0;
			try {
				total=num1/num2;
			}catch (Exception e) {
			return total;
		}
			return total;
		}

		public static int resto(int num1, int num2) {
			int total=0;
			try {
				total=num1%num2;
			}catch (Exception e) {
			return total;
		}
			return total;
		}
		public static int mostrarMenu() {
			int numopcion;

			System.out.println("\n\nElige operación matemática, para eso elige una opción.");
			System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Resto\n6. Salir");
			do {
				numopcion=pedirNumero();
			}while(numopcion<1 ||numopcion>6);
			return numopcion;
		}

		public static void main(String[] args) {
			int num1, num2, op;

			num1=pedirNumero();
			num2=pedirNumero();
			op=mostrarMenu();
			while(op !=6) {
				switch (op) {
				case 1: System.out.println("El resultado es: "+suma(num1, num2)); break;
				case 2: System.out.println("El resultado es: "+resta(num1, num2)); break;
				case 3: System.out.println("El resultado es: "+multiplicacion(num1, num2)); break;
				case 4: System.out.println("El resultado es: "+division(num1, num2)); break;
				case 5: System.out.println("El resultado es: "+resto(num1, num2)); break;
				}
				op=mostrarMenu();
			}
			System.out.println("\n\nHas elegido salir, programa finalizado.");


		}

	}