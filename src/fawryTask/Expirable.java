package fawryTask;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Expirable extends Product {

	private LocalDate expiry = null; 
	Scanner scanner = new Scanner(System.in);
	
	public Expirable(String name, double price, int quantity,LocalDate expiry){
		super(name,price,quantity);
		if(quantity<=0 || price<=0) {
			throw new IllegalArgumentException("Invalid entry, enter a positive number");
		}
		this.expiry = expiry;
		
	}
	
	public void setExpiryDate(LocalDate expiry) {
		this.expiry=expiry;
	}
	public LocalDate getExpiryDate() {
		return expiry;
	}
	public boolean isExpired() {
        return LocalDate.now().isAfter(expiry);
    }
}
