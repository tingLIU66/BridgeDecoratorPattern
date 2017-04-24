package coffeeDeco;

import drink.Drink;

public class Sugar extends CoffeeDecorator{
	
	protected Drink drink;
	
	public Sugar(Drink drink){
		
		this.drink = drink;
	}
	
	@Override
	public String getDrinkdescription() {
		
		return drink.getDrinkdescription() + ", add Sugar";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return drink.cost() + 0.1f;
	}



}
