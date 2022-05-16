package calculator;

public class Calculator {

	static UserInput uInput = new UserInput();

	public Calculator(double num, double num1) {

	}

	public static double add() {
		double sum = (uInput.input() + uInput.input1());
		System.out.println("The answer is: " + sum);
		return (sum);
	}

	public static double minus() {
		double sum = (uInput.input() - uInput.input1());
		System.out.println("The answer is: " + sum);
		return (sum);
	}

	public static double multiply() {
		double sum = (uInput.input() * uInput.input1());
		System.out.println("The answer is: " + sum);
		return (sum);
	}

	public static double divide() {
		double x = (uInput.input());
		double y = (uInput.input1());
		double sum = (x / y);
		if (x > y) {
			System.out.println("The answer is: " + sum.);
			return (sum);
		} else {
			System.out.println("Division cannot be performed.");
			return (sum);
		}
	}
}
