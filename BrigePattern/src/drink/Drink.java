package drink;


import java.util.ArrayList;
import java.util.List;

import cup.Cups;

public abstract class Drink {
	
	protected String drinkname;	
	protected float price;	
	protected Cups cupsize;
	protected int qty;
	
	
	
	
	public String getDrinkname() {
		return drinkname;
	}


	public void setDrinkname(String drinkname) {
		this.drinkname = drinkname;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


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


	public float getTotalPrice(){
		
		return getPrice() * cupsize.pricerate();	
		
	}

	
	public abstract void OrderDrink(int qty);
	
}
