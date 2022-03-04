
import java.util.Scanner;

public class Main {
	BST tree;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Main m = new Main();
		BST tree = new BST();
		m.testAdd();
		m.userInput();

	}

	private void testAdd() {
		Dollar[] currencyObjects = new Dollar[21];
		currencyObjects[0] = new Dollar(57.12);
		currencyObjects[1] = new Dollar(23.44);
		currencyObjects[2] = new Dollar(87.43);
		currencyObjects[3] = new Dollar(68.99);
		currencyObjects[4] = new Dollar(111.22);
		currencyObjects[5] = new Dollar(44.55);
		currencyObjects[6] = new Dollar(77.77);
		currencyObjects[7] = new Dollar(18.36);
		currencyObjects[8] = new Dollar(543.21);
		currencyObjects[9] = new Dollar(20.21);
		currencyObjects[10] = new Dollar(345.67);
		currencyObjects[11] = new Dollar(36.18);
		currencyObjects[12] = new Dollar(48.48);
		currencyObjects[13] = new Dollar(101.00);
		currencyObjects[14] = new Dollar(11.00);
		currencyObjects[15] = new Dollar(21.00);
		currencyObjects[16] = new Dollar(51.00);
		currencyObjects[17] = new Dollar(1.00);
		currencyObjects[18] = new Dollar(251.00);
		currencyObjects[19] = new Dollar(151.00);
		currencyObjects[20] = new Dollar(48.48);
		tree = new BST();
		for (int i = 0; i < currencyObjects.length; i++) {
			tree.add(currencyObjects[i]);
		}

	}

	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tree Simulator:");
		System.out.println(
				"Enter command(a = add, r = remove, c = count, s = search, q(or anything else that's not a command) = quit, p = print): ");
		while (true) {
			String ops = sc.next();

			if (ops.equals("a")) {
				System.out.println("Input value as double:");
				double val = sc.nextDouble();
				if (val >= 0 && val <= 1000) {
					Dollar x = new Dollar(val);
					tree.add(x);
					System.out.println("Added:");
					x.print();
				} else {
					System.out.println("Invalid value!(Must be between 0-1000)");
				}

			}
			if (ops.equals("r")) {
				System.out.println("Input value as double:");
				double val = sc.nextDouble();
				Dollar x = new Dollar(val);
				if (val >= 0 && val <= 1000 && tree.search(x) != null) {

					tree.remove(x);
					System.out.println("Removed:");
					x.print();
				} else {
					System.out.println("Invalid value or node missing!(Must be between 0-1000)");
				}
			}
			if (ops.equals("s")) {
				System.out.println("Input value as double:");
				Dollar x = new Dollar(sc.nextDouble());
				if (tree.search(x) == null) {
					System.out.println("Not Found!");
				} else {
					System.out.println("Found!");
				}

			}
			if (ops.equals("c")) {
				System.out.println("There are " + tree.count() + " nodes.");
			}
			if (ops.equals("p")) {
				tree.printInorder();
			}

			else if (ops.equals("q")) {
				sc.close();
				System.exit(0);
			}
		}
	}

}
