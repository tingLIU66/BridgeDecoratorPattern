package drink;

import cup.Cups;

public abstract class Drink {
	
	protected String drinkdescription = "Unknown Drink";	
	protected float price;	
	protected Cups cupsize;
	protected int qty;
	
	
	
	
	public String getDrinkdescription() {
		return drinkdescription;
	}


	public void setDrinkdescription(String drinkdescription) {
		this.drinkdescription = drinkdescription;
	}


	/*public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}*/


	public void SetCups(Cups cupsize){
		
		this.cupsize = cupsize;
	
	}

	
	public String getSize(){
		
		return cupsize.ChooseSize();	
		
	}

	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public float getPricerate(){
		
		return cupsize.pricerate();	
		
	}
	
	public abstract float cost();

	
	public void OrderDrink(int qty){
		
		setQty(qty);
	}
	
}
