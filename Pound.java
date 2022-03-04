/*
public class Pound extends Currency {
private String type = "Pound";
	public Pound() {
		super();
	}

	public Pound(Pound x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
	}

	public Pound(double z) {
		super(z);
	}

	public String getType() {
		return type;
	}
	
	public Pound add(Pound a, Pound b) {
		Pound x = new Pound(((a.getUnit()+b.getUnit())*100+a.getFraction()+b.getFraction())/100.0);
		return x;
	}
	public Pound subtract(Pound a, Pound b) {
		double one = a.getUnit()*100+a.getFraction()/100;
		double two = b.getUnit()*100+b.getFraction()/100;
		if (one>=two) {
			Pound x = new Pound(one-two);
			return x;
		}
		else {
			Pound x = new Pound(two-one);
			return x;
		}

		
	}
	public boolean isEqual(Pound a, Pound b) {
		if (a.getUnit()==b.getUnit()&&a.getFraction()==b.getFraction()) {
			return true;
		}
		return false;
	}
	public Pound isGreater(Pound a, Pound b) {
		if (a.getUnit()>b.getUnit()||a.getUnit()>=b.getUnit()&&a.getFraction()>b.getFraction()) {
			return a;
		}
		return b;
	}
	public void print(Pound a) {
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

public class Pound extends Currency {

	private String type = "Pound";

	public Pound() {
		// TODO Auto-generated constructor stub
		super();
	}

	// Copy constructor for Dollar
	public Pound(Pound x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
	}

	// Constructor based on one single input of type double
	public Pound(double z) {
		super(z);
	}

	// Getter for String attribute
	public String getType() {
		return type;
	}

	// add method

	public void print() {
		System.out.println(this.getUnit() + "." + this.getFraction() + " " + type);
	}

}
