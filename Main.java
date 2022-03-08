
package test;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.FileWriter; // Imports File Writer

/*   
 *  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		m.testAdd();
		
	}
	private void testAdd() {
		Dollar[] currencyObjects = new Dollar[20];
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
		BST tree = new BST();
		for (int i = 0; i < currencyObjects.length; i++) {
			tree.add(currencyObjects[i]);
		}
		
		tree.printInorder();
		System.out.println(tree.count());
		tree.remove(currencyObjects[0]);
		tree.printInorder();
	}

}
