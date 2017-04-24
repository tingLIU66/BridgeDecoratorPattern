package drink;


public class SoftDrink extends Drink{
	
	public SoftDrink() {
		 
		 this.drinkdescription = "SoftDrink";
	 }




		@Override
		public float cost() {
			return 1.0f;
		}

}
