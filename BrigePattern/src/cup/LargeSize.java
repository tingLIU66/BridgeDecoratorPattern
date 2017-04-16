package cup;

public class LargeSize implements Cups{
	
	protected float pricerate;
	
	
	@Override
	public String ChooseSize() {
		
		return "Large";
		
	}

	@Override
	public float pricerate() {
		
		return pricerate = 1.5f;
	}

}
