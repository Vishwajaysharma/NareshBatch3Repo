package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;

public class ProductPriceLookUp 
{

	public static void main(String[] args) 
	{
		Map<String, Double> ProductPrices = new HashMap<String, Double>();
		ProductPrices.put("Laptop", 899.99);
		ProductPrices.put("Tablet", 299.99);
		ProductPrices.put("Smartphone", 699.99);
		
		//check price for Specific product
		String product = "Tablet";
		Double price = ProductPrices.get(product);
		if(price!=null)
			System.out.println(product + " costs $ " + price);
		else
			System.out.println("Product not found");
	}

}
