package fawryTask;

import java.time.LocalDate;

public class ExpirableShippable extends Product implements ShippableInter{
	private double weight;
	private LocalDate expiry;
	public ExpirableShippable(String name, double price, int quantity, double weight,LocalDate expiry) {
		super(name,price,quantity);
		if(quantity<=0 || price<=0 || weight<=0) {
			throw new IllegalArgumentException("Invalid entry, enter a positive number");
		}
		this.weight = weight;
		this.expiry = expiry;
	}
	public void setExpiryDate(LocalDate expiry) {
		this.expiry=expiry;
	}
	public LocalDate getExpiryDate() {
		return expiry;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public boolean isExpired() {
        return LocalDate.now().isAfter(expiry);
    }

}
