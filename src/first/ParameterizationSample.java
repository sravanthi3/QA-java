package first;

public class ParameterizationSample {

	public static void add(int a, int b, int c) {
		// PArameterised method: can be re-use with different values at the run time
		System.out.println(a + b+ c);
	}

	public static void add() {
		int a = 90;
		int b = 80;
		System.out.println(a + b);
	}

	public static void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		add();// 170

		add(100, 150,50);
		add(12, 13,10);
		add(54, 6, 2);
		add();
		// sub();
		test();
	}

}