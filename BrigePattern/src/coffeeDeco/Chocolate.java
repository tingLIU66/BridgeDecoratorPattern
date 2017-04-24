package coffeeDeco;

import drink.Drink;

public class Chocolate extends CoffeeDecorator{
	
	protected Drink drink;
	
	public Chocolate(Drink drink){
	
	this.drink = drink;
	
	}

	@Override
	public String getDrinkdescription() {
		
		return drink.getDrinkdescription() + ", add Chocolate";
		
	
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return drink.cost() + 0.95f;
	}



}
       