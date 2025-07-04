package fawryTask;

public class CartItem {
	private Product product;
	private int quantity;
	public CartItem(Product product,int quantity) {
		if(quantity<=0) {
			throw new IllegalArgumentException("Invalid entry, enter a positive number");
		}
		this.product=product;
		this.quantity=quantity;
	}
	public void setProduct(Product product) {
		this.product=product;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTotal() {
		return product.getPrice()*quantity;
	}
}
