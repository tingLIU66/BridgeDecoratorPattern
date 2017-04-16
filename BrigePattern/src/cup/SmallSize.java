package cup;

public class SmallSize extends Cups{
	
	protected float pricerate;
	
	

	public float getPricerate() {
		return pricerate;
	}



	public void setPricerate(float pricerate) {
		this.pricerate = pricerate;
	}

	@Override
	public String ChooseSize() {
	
		return "Small";
		
	}

	@Override
	public float pricerate() {
		
		return pricerate = 0.7f;
	}

}
