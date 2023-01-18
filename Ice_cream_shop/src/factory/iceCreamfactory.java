package factory;

import model.Icecream; 
import model.bucketIcecream;
import model.coneicecream;

public class iceCreamfactory {

	public iceCreamfactory() {

	}

	public Icecream make(String str, String flavour, String type, int pay) {

		if (str.equals("Bucket")) {
			System.out.println("Prepare the bucket");
			System.out.println("Fill the ice cream until the box is full");
			if (type.equalsIgnoreCase("Special")) {
				System.out.println("Add some cookies on the of the ice cream");
			}
			System.out.println(flavour + " " + type + " Bucket ice cream is ready to serve...");
			return new bucketIcecream(pay, type, flavour);
		} else if (str.equals("Cone")) {
			System.out.println("Prepare the cone");
			System.out.println("Put the " + flavour + " ice cream flavour on top of cone");
			if (type.equals("Special")) {
				System.out.println("Put some chocolate on top of the ice cream");
				System.out.print("Add extra waffle stick on top of the ice cream");
			}
			System.out.println(flavour + " " + type + " Cone ice cream is ready to serve...");
			return new coneicecream(pay, type, flavour);
		}

		return null;
	}

}
