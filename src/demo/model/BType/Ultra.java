package demo.model.BType;

import demo.model.BType.*;
import demo.model.Bsize.*;


public class Ultra extends BurgerType {
	private BurgerSize size;

	
	@Override
	public String displayBurger() {
		return "Ultra Burger!!!";
	}
	
	@Override
	public String descriptionBurger() {
		return "This burger is so delicious. Like Legit";
	}
	@Override
	public void setSize(BurgerSize size) {
		this.size = size;

	}

	@Override
	public BurgerSize getSize() {
		return size;
	}

}
