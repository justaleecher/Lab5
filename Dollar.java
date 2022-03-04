/*
public class Dollar extends Currency {
private String type = "Dollar";
	public Dollar() {
		super();
	}

	public Dollar(Dollar x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
	}

	public Dollar(double z) {
		super(z);
	}

	public String getType() {
		return type;
	}
	
	public Dollar add(Dollar a, Dollar b) {
		Dollar x = new Dollar(((a.getUnit()+b.getUnit())*100+a.getFraction()+b.getFraction())/100.0);
		return x;
	}
	public Dollar subtract(Dollar a, Dollar b) {
		double one = a.getUnit()*100+a.getFraction()/100;
		double two = b.getUnit()*100+b.getFraction()/100;
		if (one>=two) {
			Dollar x = new Dollar(one-two);
			return x;
		}
		else {
			Dollar x = new Dollar(two-one);
			return x;
		}

		
	}
	public boolean isEqual(Dollar a, Dollar b) {
		if (a.getUnit()==b.getUnit()&&a.getFraction()==b.getFraction()) {
			return true;
		}
		return false;
	}
	public Dollar isGreater(Dollar a, Dollar b) {
		if (a.getUnit()>b.getUnit()||a.getUnit()>=b.getUnit()&&a.getFraction()>b.getFraction()) {
			return a;
		}
		return b;
	}
	public void print(Dollar a) {
		System.out.println(a.getUnit()+"."+a.getFraction()+" "+type);
	}
		
	
}
*/
/*   
 *  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Dollar extends Currency {
// Non public String Attribute which contains name of 
	private String type = "Dollar";

	// Default constructor for Dollar
	public Dollar() {
		super();
	}

	// Copy constructor for Dollar
	public Dollar(Dollar x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
	}

	// Constructor based on one single input of type double
	public Dollar(double z) {
		super(z);
	}

	// Getter for String attribute
	public String getType() {
		return type;
	}

	public void print() {
		System.out.println(this.getUnit() + "." + this.getFraction() + " " + type);
	}

}
