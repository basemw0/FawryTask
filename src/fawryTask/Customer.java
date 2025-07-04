package fawryTask;

public class Customer {
	private String name;
	private double balance;
	private Cart cart;
	private int BaseShipping = 30;
	
	public Customer(String name,double balance) {
		this.name = name;
		this.balance = balance;
		this.cart = new Cart();	
	}
	public double getBalance() {
        return balance;
    }
	public Cart getCart() {
		return cart;
	}
	public void checkout() {
		final double cartSubTotal = cart.getSubTotal();
		if(cart.isEmpty()) {
			throw new IllegalArgumentException("Cart is Empty");
		}
		for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();

            boolean expired = false;
            if (product instanceof Expirable expirable) {
                expired = expirable.isExpired();
            } else if (product instanceof ExpirableShippable expirableShippable) {
                expired = expirableShippable.isExpired();
            }

            if (expired) {
                throw new IllegalStateException(product.getName() + " is expired.");
            }
        }
		if(balance<(BaseShipping+cartSubTotal)) {
			throw new IllegalArgumentException("Insufficient balance");
		}else {
		balance -= (BaseShipping+cartSubTotal);
		System.out.println("Your order Subtotal: "+cartSubTotal+" EGP");
		System.out.println("Your shipping fees are: "+BaseShipping);
		System.out.println("Your total Paid amount: "+(cartSubTotal+BaseShipping));
		System.out.println("Your current balance: "+balance);
		}
		for(CartItem item: cart.getItems()) {
			item.getProduct().setQuantity(item.getProduct().getQuantity()-1);
			
		}
		
		
		
	}
}
