package fawryTask;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private double totalSum=0;
	
	private List<CartItem> cartItems = new ArrayList<>(); 
	public void addItem(Product product, int quantity) {
		if(quantity > product.getQuantity()) {
			throw new IllegalArgumentException("Not enough stock.");
		}else {
		cartItems.add(new CartItem(product,quantity));
		}
	}
	public boolean isEmpty() {
		return cartItems.isEmpty();
	}
	public List<CartItem> getItems() {
		return cartItems;
	}
	public double getSubTotal() {
		for(CartItem cart:cartItems) {
			totalSum+=cart.getTotal();
		}
		return totalSum;
	}
	public List<ShippableInter> getShippableItems() {
        List<ShippableInter> shippables = new ArrayList<>();
        for (CartItem item : cartItems) {
            Product p = item.getProduct();
            if (p instanceof ShippableInter) {
                for (int i = 0; i < item.getQuantity(); i++) {
                    shippables.add((ShippableInter) p);
                }
            }
        }
        return shippables;
    }
}
