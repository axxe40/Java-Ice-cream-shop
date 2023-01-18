import java.util.Scanner; 

import adapter.Currencyadapter;
import factory.iceCreamfactory;
import model.bucketIcecream;
import model.coneicecream;
import singleton.History;

public class Main {
	Scanner sc = new Scanner(System.in);
    iceCreamfactory icecreamf = new iceCreamfactory();
	public int biarcepet() {
		int m = sc.nextInt();
		sc.nextLine();
		return m;
	}

	public Main() {
       Menu();
	}

	public void Menu() {
		System.out.println("where do you want to go? ");
		System.out.println("1. Cone Ice Cream Shop");
		System.out.println("2. Bucket Ice Cream Shop");
		System.out.println("3. Exit");
		System.out.print(">> ");
		
		int m = biarcepet();
		
		if (m == 1) {
			coneStall();
		} else if (m == 2) {
			bucketStall();
		} else if (m == 3) {
			exit();
		}	
 }
	
	public void exit() {
      History hs = History.getInstance();
      hs.show();
      
      System.out.println("Press enter again to close the program ");
      sc.nextLine();
      System.exit(0);
	}

	public void bucketStall() {
		String f;
		String t;
		String c;
		int m;

		do {

			System.out.println("Add flavour [Chocolate | Strawberry] : ");
			f = sc.nextLine();
		} while (!f.equals("Chocolate") && !f.equals("Strawberry"));
		
		do {
			System.out.println("Add type [regular | special] : ");
			t = sc.nextLine();
		} while (t.equals("regular") && t.equals("special"));
		
		do {
			System.out.println("Input money : ");
			m = biarcepet();
		} while (m < 1);
		do {

			System.out.println("Input Currency [IDR | USD | SGD] : ");
			c = sc.nextLine();
		} while (c.equals("IDR") && c.equals("USD") && c.equals("SGD"));
	
	Currencyadapter cradap = new Currencyadapter(m);
	
	bucketIcecream bk = (bucketIcecream) icecreamf.make("Bucket", f, t,
			             cradap.getMoney(c));
	
	
			     
	System.out.println();
	History history = History.getInstance();
	
	 history.add(bk);
	 sc.nextLine();
	 Menu();
	}

	public void coneStall() {
		String f;
		String t;
		String c;
		int m;
		do {

			System.out.println("Add flavour [Chocolate | Strawberry] : ");
			f = sc.nextLine();
		} while (f.equals("Chococolate") && f.equals("Strawberry"));
		
		do {
			System.out.println("Add type [regular | special] : ");
			t = sc.nextLine();
		} while (t.equals("Regular") && t.equals("Special"));
		
		do {
			System.out.println("Input money : ");
			m = biarcepet();
		} while (m < 1);
		do {

			System.out.println("Input Currency [IDR | USD | SGD] : ");
			c = sc.nextLine();
		} while (!c.equals("IDR") && !c.equals("USD") && !c.equals("SGD"));
	
	Currencyadapter cradap = new Currencyadapter(m);
	
	coneicecream cn = (coneicecream) icecreamf.make("Cone", f, t, 
			           cradap.getMoney(c));
	
	History history = History.getInstance();
	 history.add(cn);
	 sc.nextLine();
	 Menu();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
