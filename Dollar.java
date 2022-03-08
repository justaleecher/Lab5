package test;
/*   
 *  Name Block:
 *  Lab Number: Lab 4
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Dollar extends Currency{
private String name = "Dollar";

public Dollar() {
	super();
}

public Dollar(double money) {
		super(money);
}

public String getName() {
	    return name;
}
}
