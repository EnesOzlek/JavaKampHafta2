package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("DELONGHİ");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image.jpg");

		

		Product product2 = new Product();
		product2.setName("DELONGHİ");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image.jpg");
		

		Product product3 = new Product();
		
		product3.setName("DELONGHİ");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image.jpg");
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			System.out.println("<li>"+  product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("11");
		individualCustomer.setCustomerNumber("1231");
		individualCustomer.setFirstName("enes");
		individualCustomer.setLastName("zlk");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("dfsfs");
		corporateCustomer.setPhone("313");
		corporateCustomer.setTaxNumber("1212");
		corporateCustomer.setCustomerNumber("313");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
	}

}
