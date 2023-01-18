package adapter;

public class Currencyadapter {
    int money;
    

	public Currencyadapter(int money) {
		
		this.money = money;
	}
	
	public int getMoney(String currency) {
		switch (currency) {
		case "IDR":
			return this.money;
		case "SGD":
			return this.money *12000;
		case "USD":
			return this.money *14000;
	
		}
	    return 0;
	}
}
