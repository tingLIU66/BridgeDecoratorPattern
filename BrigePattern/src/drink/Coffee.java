package drink;

import java.util.List;

public class Coffee extends Drink{
	
 public Coffee() {
	 
	 this.drinkdescription = "Coffee";
 }


	@Override
	public float cost() {
		return 2.0f;
	}

}
