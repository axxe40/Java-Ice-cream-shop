package model;

public class bucketIcecream extends Icecream {

	public bucketIcecream(int pay, String type, String flavour) {
		super(pay, type, flavour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(super.getFlavour() + " " + super.getType() 
		 + " Bucket " + " Ice cream - " + this.getPay());
	}

	
}
