package singleton;

import java.util.Vector;  

import model.Icecream;

public class History {

	private static History history;
	private Vector<Icecream> icecreamlist = new Vector<>();

	public static History getInstance() {
		if (history == null)
			history = new History();

		return history;
	}

	public void add(Icecream Icecream) {
		icecreamlist.add(Icecream);
	}

	public void show() {
		System.out.println("History of sold ice creams");
		System.out.println("===========================");
		int count = 1;
		int spend = 0;
		for (Icecream Icecream : icecreamlist) {
//		show ice cram name	
			System.out.print(count + "."); 
			Icecream.show();

//		count the spend price
			spend += Icecream.getPay();

			count += 1;
		}
		System.out.println("Total spend: " + spend);
	}
}
