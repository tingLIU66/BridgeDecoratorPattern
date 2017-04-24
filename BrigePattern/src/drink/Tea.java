package drink;

public class Tea extends Drink{
	
	public Tea() {
		 
		 this.drinkdescription = "Tea";
	 }



		@Override
		public float cost() {
			return 2.0f;
		}

}
