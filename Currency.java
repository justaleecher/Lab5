package test;
/*   
 *  Name Block:
 *  Lab Number: Lab 4
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

abstract class Currency {
private int NoteValue;
private int CoinValue;

/*
 * Method: getName()
 * Pre: getName - String from Derived Currency Methods
 * Post: returns this.getName
*/

public String getName() {
	return this.getName();
}

//Documentation not required for constructors 

// Currency Constructor, defaults currency object to 0 note and 0 coin
public Currency(){
	super();
	NoteValue = 0;
	CoinValue = 0;
}

// Currency Constructor as well, allows currency object to have note and coin values
public Currency(double money) {
	super();
	NoteValue = (int)(money);
	CoinValue = (int)Math.round((money*100)%1000);
}

/* Algorithm addCurrency(Currency object)
 * Pre: input x - Currency object
 * Post: output none
 * 
 * if coin value added to currency coin value is greater than or equals 100 coins
 * 		set coinvalue to current coin value with added coin value
 * 		set notevalue to to rounded version of current note value and added note value
*/

public void addCurrency(Currency x){
	if(this.getName().equalsIgnoreCase(x.getName())){
		   setNoteValue((this.getNoteValue()+x.getNoteValue()));
		   setCoinValue((this.getCoinValue()+x.getCoinValue()));
	   }
}

/*
 * 
 */

public void subtractCurrency(Currency x) {
	if(this.getName().equalsIgnoreCase(x.getName())) {
		double one = (this.getNoteValue()*100 + this.getCoinValue())/100.0;
		double two = (x.getNoteValue()*100 + x.getCoinValue())/100.0;
		if(one > two) {
			setNoteValue((int)(one - two));
			setCoinValue((int)((one - two)*100)%100);
		}else {
			setNoteValue((int)(two - one));
			setNoteValue((int)((two - one)*100)%100);
		}
	}
}

public boolean isEqual(Currency x) {
	if(this.getNoteValue() == x.getNoteValue() && this.getCoinValue() == x.getCoinValue()) {
		return true;
	}else {
		return false;
	}
}

public boolean isGreater(Currency x) {
	if(this.getNoteValue() >= x.getNoteValue() || this.getNoteValue() >= x.getNoteValue() && this.getCoinValue() > x.getCoinValue()) {
		return true;
	}else {
		return false;
	}
}

void print(){
System.out.print(((double)this.NoteValue + ((double)this.getCoinValue())/100.0) + " " + getName() + " " );
};

public int getNoteValue() {
	return NoteValue;
}
public void setNoteValue(int noteValue) {
	NoteValue = noteValue;
}
public int getCoinValue() {
	return CoinValue;
}
public void setCoinValue(int coinValue) {
	CoinValue = coinValue;
}


}
