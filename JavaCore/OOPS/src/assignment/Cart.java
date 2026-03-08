package assignment;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> products=new ArrayList<>();
	
	public void addProduct(Product product) {
		
		for(Product p : products) {
			
            if (p.getProductId()==product.getProductId()) {
            	
                p.setQuantity(p.getQuantity() + product.getQuantity());
                
                return;
            }
        }
		
		products.add(product);
	}
	
	public void removeProduct(int productId) {
		
		for (Product p : products) {
	        
			if (p.getProductId() == productId) {
	            
				products.remove(p);
	            
				System.out.println("Product removed successfully.");
	            
				return;
	        }
	    }

	    System.out.println("Product not found.");
	}
	
	public double calculateCartTotal() {
		
		double amount=0;
		
		for(Product product : products) {
			
			amount+=product.calculateTotal();
		}
		
		return amount;
	}
	
	public void displayAllCartItems() {
		
		if (products.isEmpty()) {
            
			System.out.println("Cart is empty.");
            
			return;
        }
 
		for(Product product : products) {
			
			System.out.println(product.getProductDetails());
		}
		
		System.out.println("Total Cart Value : " + calculateCartTotal());
	}
	
}
