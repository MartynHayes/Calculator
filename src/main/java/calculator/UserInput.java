package calculator;

import java.util.Scanner;

public class UserInput {
	Double input;
	Double input1;
	String op;

	public String userScan() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter operator: ");
		System.out.println("Add / Subtract/ Multiply / Divide");

		String operator = scan.nextLine();
		String op = operator.toLowerCase();
		return op;
	}

	public Double input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		Double num = scan.nextDouble();
		return num;
	}

	public Double input1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your second number: ");
		Double num1 = scan.nextDouble();
		return num1;
	}

}
