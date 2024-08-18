package view;

import java.util.Scanner;

import controller.ControllerDigitos;

public class Principal {

	public static void main(String[] args) {
		ControllerDigitos contDigit = new ControllerDigitos();
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int digitos = contDigit.contaDigitos(numero);
		
		System.out.println("O número " + numero + " tem " + digitos + " dígito(s).");
		sc.close();
	}

}
