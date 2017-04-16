package drink;

import java.util.List;

public class SoftDrink extends Drink{
	
	protected String brand;
	
	

	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	@Override
	public void OrderDrink(int qty) {
	
		super.setQty(qty);
		
	}

}
