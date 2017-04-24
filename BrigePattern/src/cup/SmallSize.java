package cup;

public class SmallSize implements Cups{
	
	protected float pricerate;
	


	@Override
	public String ChooseSize() {
	
		return "Small";
		
	}

	@Override
	public float pricerate() {
		
		return pricerate = 0.8f;
	}

}
