package fr.operateurs.console;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class OperatuersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("***** Application Opératuers ***** \n "
				+ "Veuillez saisir le premier nombre..." );
		double firstNumber = sc.nextDouble();
		System.out.println("Veuillez saisir le second nombre..." );
		double secondNumber = sc.nextDouble();
		System.out.println( firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber) + "\n");
		System.out.println( firstNumber + "-" + secondNumber + "=" +  new BigDecimal(Double.toString(firstNumber)).subtract(new BigDecimal(Double.toString(secondNumber))));
		System.out.println( firstNumber + "*" + secondNumber + "=" + firstNumber * secondNumber + "\n");
		System.out.println( firstNumber + "/" + secondNumber + "=" + firstNumber / secondNumber + "\n");
		System.out.println( firstNumber + "%" + secondNumber + "=" + firstNumber % secondNumber + "\n");
	
		sc.close();
	}

}