package drink;

public class Tea extends Drink{
	
	protected String teatype;
	
	

	public String getTeatype() {
		return teatype;
	}



	public void setTeatype(String teatype) {
		this.teatype = teatype;
	}



	@Override
	public void OrderDrink(int qty) {
		
		super.setQty(qty);
	
	}

}
