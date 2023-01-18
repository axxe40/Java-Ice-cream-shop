package model;

public abstract class Icecream {

	private int pay;
	private String type;
	private String flavour;
	
	public abstract  void show();

	public Icecream(int pay, String type, String flavour) {
		super();
		this.pay = pay;
		this.type = type;
		this.flavour = flavour;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

}
