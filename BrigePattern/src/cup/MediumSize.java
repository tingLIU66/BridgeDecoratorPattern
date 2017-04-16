package cup;

public class MediumSize implements Cups {
	
	protected float pricerate;
	
	
	@Override
	public String ChooseSize() {
		
		return "Medium";
		
	}

	@Override
	public float pricerate() {
		
		return pricerate = 1.0f;
	}

}
