package fawryTask;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Product cheese = new ExpirableShippable("Cheese", 50.0, 10, 2.5, LocalDate.of(2026, 10, 10));
        Product tv = new Shippable("TV", 5000.0, 2, 15);
        Product biscuits = new Expirable("Biscuits", 20.0, 5, LocalDate.now().plusDays(1));
        Product mobileCard = new Product("Scratch Card", 10.0, 50);

        Customer Basem = new Customer("Beso", 6000.0);

        Basem.getCart().addItem(cheese, 1);
        Basem.getCart().addItem(tv, 1);
        Basem.getCart().addItem(biscuits, 2);
        Basem.getCart().addItem(mobileCard, 3);

        Basem.checkout();

        ShippingService.sendItems(Basem.getCart().getShippableItems());
    }
		
	

}
