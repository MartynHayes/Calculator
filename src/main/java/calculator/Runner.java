package calculator;

public class Runner {

	public static void main(String[] args) {
		UserInput uPut = new UserInput();
		Selector sel = new Selector();

		sel.selector(uPut.userScan());
	}

}
