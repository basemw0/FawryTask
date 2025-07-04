package fawryTask;

public class Shippable extends Product implements ShippableInter{
	private double weight;
	public Shippable(String name, double price, int quantity,double weight){
		super(name,price,quantity);
		if(quantity<=0 || price<=0 || weight<=0) {
			throw new IllegalArgumentException("Invalid entry, enter a positive number");
		}
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
}
