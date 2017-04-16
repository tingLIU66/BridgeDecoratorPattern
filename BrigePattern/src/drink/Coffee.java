package drink;

import java.util.List;

public class Coffee extends Drink{
	
	protected String addmilk;
	
	

	public String getAddmilk() {
		return addmilk;
	}



	public void setAddmilk(String addmilk) {
		this.addmilk = addmilk;
	}



	@Override
	public void OrderDrink(int qty) {	
	
		super.setQty(qty);
		
	}

}
