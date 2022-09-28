package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "LAPTOP", "ASUS", 300, 2, "SİYAH");
		
		product.set_name("Laptop");
		product.set_description("Casper");
		product.set_price(100000);
		product.set_stockAmount(6);
		product.set_renk("");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getkod());

		
		
		
		
		
	}

}
