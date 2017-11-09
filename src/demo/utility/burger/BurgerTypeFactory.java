package demo.utility.burger;

import demo.model.Bsize.*;
import demo.model.BType.*;


public class BurgerTypeFactory implements AbstractFactoryBurger{

	@Override
	public BurgerType getBurger(String type) {
		BurgerType burgertype2 = null;
		

		if (type.equalsIgnoreCase("Ultra")) {
			burgertype2 = new Ultra();
		} else if (type.equalsIgnoreCase("Ultra Mega")) {
			burgertype2 = new UltraMega();
		} else {
			System.out.println("Sorry");
		}
		return burgertype2;
	}

	@Override
	public BurgerSize getSize(String burgersize) {
		// TODO Auto-generated method stub
		return null;
	}

}
