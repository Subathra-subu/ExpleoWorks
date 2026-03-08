package assignment;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public Product(int productId,String productName,double price,int quantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int new_quatity) {
		
		if(new_quatity > 0)
			
			quantity = new_quatity;
		
		else System.out.println("Invalid Quantity");
	}
	
	public double calculateTotal() {
		return price*quantity;
	}
	
	public String getProductDetails() {
		return "\nProduct Id: "+getProductId()+"\nProduct Name: "+getProductName()+"\nPrice: "+getPrice()+"\nQuantity: "+getQuantity()+"\nTotal: "+calculateTotal();
	}
	
	 public static void main(String[] args) {

	        Cart cart = new Cart();

	        Product p1 = new Product(101, "Laptop", 50000, 1);
	        
	        Product p2 = new Product(102, "Mouse", 500, 2);
	        
	        Product p3 = new Product(103, "Keyboard", 1500, 1);

	        cart.addProduct(p1);
	        
	        cart.addProduct(p2);
	        
	        cart.addProduct(p3);

	        System.out.println("Cart Items:");
	        cart.displayAllCartItems();

	        double total = cart.calculateCartTotal();
	        System.out.println("Total Cart Amount: " + total);

	        cart.removeProduct(102);

	        System.out.println("\nAfter Removing Product 102:");
	        cart.displayAllCartItems();

	        double updatedTotal = cart.calculateCartTotal();
	        System.out.println("Updated Total Cart Amount: " + updatedTotal);

           }
}
