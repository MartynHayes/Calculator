package calculator;

public class Selector {

	public void selector(String op) {
		if (op.equals("add")) {
			Calculator.add();
		} else if (op.equals("subtract")) {
			Calculator.minus();
		} else if (op.equals("multiply")) {
			Calculator.multiply();
		} else if (op.equals("divide")) {
			Calculator.divide();
		} else {
			System.out.println("Invalid operator.");
		}

	}

}
