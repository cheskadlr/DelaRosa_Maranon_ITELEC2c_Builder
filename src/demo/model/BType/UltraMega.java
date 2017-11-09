package demo.model.BType;

import demo.model.BType.*;
import demo.model.Bsize.BurgerSize;
import demo.model.Bsize.*;

public class UltraMega extends BurgerType {
	private BurgerSize size;

	
	@Override
	public String displayBurger() {
		return "Ultra Mega Burger!!!";
	}
	
	@Override
	public String descriptionBurger() {
		return "This burger is so ultra mega delicious. Like Legit";
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
