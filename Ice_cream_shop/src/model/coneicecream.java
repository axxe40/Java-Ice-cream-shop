package model;

public class coneicecream extends Icecream {

	public coneicecream(int pay, String type, String flavour) {
		super(pay, type, flavour);
		// TODO Auto-generated constructor stub
	}

	
	public void show() {
		System.out.println(super.getFlavour() + " " + super.getType() 
		 + " Cone " + " Ice cream - " + this.getPay());
	}

}
