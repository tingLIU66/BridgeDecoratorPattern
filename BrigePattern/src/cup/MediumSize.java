package cup;

public class MediumSize extends Cups {
	
	protected float pricerate;
	
	

	public float getPricerate() {
		return pricerate;
	}



	public void setPricerate(float pricerate) {
		this.pricerate = pricerate;
	}

	@Override
	public String ChooseSize() {
		
		return "Medium";
		
	}

	@Override
	public float pricerate() {
		
		return pricerate = 1.0f;
	}

}
