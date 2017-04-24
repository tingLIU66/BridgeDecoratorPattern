package coffeeDeco;

import drink.Drink;

public class Cream extends CoffeeDecorator{
	
	protected Drink drink;
	
	public Cream(Drink drink){
		
		this.drink = drink;
	}
	
	@Override
	public String getDrinkdescription() {
		
		return drink.getDrinkdescription() + ", add Cream";
		
	}
	
	@Override
	public float cost() {
		
		return drink.cost() + 0.2f;
	}



}
