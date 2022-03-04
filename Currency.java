/*
public abstract class Currency {
	private int unit;
	private int fraction;
	public Currency() {
		unit = 0;
		fraction = 0;
	}
	public Currency(Currency x) {
		unit = x.unit;
		fraction = x.fraction;
	}
	public Currency(double z) {
		unit = (int) z;
		fraction = (int)(z*100)%100;
	}
	
	public int getUnit() {
		return unit;
		
		
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getFraction() {
		return fraction;
	}
	public void setFraction(int fraction) {
		this.fraction = fraction;
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

abstract class Currency {
	// Default Constructor

	private int unit, fraction;

	public Currency() {
		// Two Integer Attributes
		unit = 0;
		fraction = 0;
	}

	// Construction based on one single input of type double (logical objects only)
	public Currency(double z) {
		unit = (int) z;
		fraction = (int) (z * 100) % 100;
	}

	// Copy Constructor and/or Assignment
	public Currency(Currency x) {
		unit = x.unit;
		fraction = x.fraction;
	}

	// Java doesn't have a destructor it uses garbage collection

	// Getter for Unit attribute
	public int getUnit() {
		return unit;
	}

	// Getter for Fraction attribute
	public int getFraction() {
		return fraction;
	}

	// Setter for Unit
	public void setUnit(int unit) {
		this.unit = unit;
	}

	// Setter for Fraction
	public void setFraction(int fraction) {
		this.fraction = fraction;
	}

	/*
	 * // needs to manipulate the object and can create and return new objects //
	 * method to add input object of same currency public int add(Currency x,
	 * Currency y);
	 * 
	 * // subtract method to subtract input object of same currency public int
	 * subtract(Currency x, Currency y);
	 */
	// isEqual method for comparing an input object of same currency
	public static boolean isEqual(Currency x, Currency y) {
		if (x.getUnit() == y.getUnit() && x.getFraction() == y.getFraction()) {
			return true;
		}
		return false;
	}

	// isGreater method for comparing an input object of same currency
	public static boolean isGreater(Currency x, Currency y) {
		if (x.getUnit() > y.getUnit() || x.getUnit() >= y.getUnit() && x.getFraction() > y.getFraction()) {
			return true;
		}
		return false;
	}

	public abstract void print();

	public abstract String getType();

	public Currency add(Currency a, Currency b) {
		if (a.getType().equals(b.getType()) && a.getType().equals("Dollar")) {
			Dollar x = new Dollar(((a.getUnit() + b.getUnit()) * 100 + a.getFraction() + b.getFraction()) / 100.0);
			return x;
		} else if (a.getType().equals(b.getType()) && a.getType().equals("Pound")) {
			Pound x = new Pound(((a.getUnit() + b.getUnit()) * 100 + a.getFraction() + b.getFraction()) / 100.0);
			return x;
		}
		return null;
	}

	public Currency subtract(Currency a, Currency b) {
		if (a.getType().equals(b.getType()) && a.getType().equals("Dollar")) {
			double one = (a.getUnit() * 100 + a.getFraction()) / 100.0;
			double two = (b.getUnit() * 100 + b.getFraction()) / 100.0;
			if (one >= two) {
				Dollar x = new Dollar(one - two);
				return x;
			} else {
				Dollar x = new Dollar(two - one);
				return x;
			}
		} else if (a.getType().equals(b.getType()) && a.getType().equals("Pound")) {
			double one = (a.getUnit() * 100 + a.getFraction()) / 100.0;
			double two = (b.getUnit() * 100 + b.getFraction()) / 100.0;
			if (one >= two) {
				Pound x = new Pound(one - two);
				return x;
			} else {
				Pound x = new Pound(two - one);
				return x;
			}
		}
		return null;
	}
	// abstract void print(); ??
	// print method to pring name and value of currency object in form xx.yy
	// followed by name
	// public void print() {
	// System.out.print(unit + fraction + " " + type);
	// }

	// All above must be instance methods and not static
}
