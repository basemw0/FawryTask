*Fawry Rise up Journey Task*

The following project is a simple Ecommerce system Design using OOP principles and java programming Language:

1) Class Diagram

![E-commerce class diagram](https://github.com/user-attachments/assets/b5ba1f15-1dcc-4257-9970-7be46292bfac)

2) Classes logic and structure:

- **Product**: Base class with name, price, and stock quantity.  
- **Shippable**: Extends Product and implements `ShippableInter` with weight.  
- **Expirable**: Extends Product and adds expirydate attribute.  
- **ExpirableShippable**: Combines both Shippable and Expirable features.  
- **CartItem**: Represents a product with the desired quantity in the cart.  
- **Cart**: Holds a list of CartItems and handles subtotal and shipping logic.  
- **Customer**: Can add products to cart and perform checkout with validation.  
- **ShippingService**: Accepts all shippable items and prints shipping info.

3) Features:

- Handles expired items, stock checks, and insufficient balance
- Generates a clear checkout receipt with all items and their costs
- OOP design using abstraction ,interfaces ,and inheritance

4) Sample test output:

![image](https://github.com/user-attachments/assets/833d77a0-fce9-4777-8b18-5b5ba54f1de7)



