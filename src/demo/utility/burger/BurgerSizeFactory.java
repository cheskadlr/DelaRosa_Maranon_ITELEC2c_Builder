package demo.utility.burger;

import demo.model.Bsize.*;
import demo.model.Fsize.FroyoSize;
import demo.model.BType.*;


public class BurgerSizeFactory implements AbstractFactoryBurger{

	@Override
	public BurgerType getBurger(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BurgerSize getSize(String burgersize) {
		BurgerSize size2 = null;
		if (burgersize.equalsIgnoreCase("One-Eighth")) {
			size2 = new Eight();
		} else if (burgersize.equalsIgnoreCase("One-Fourth")) {
			size2 = new Fourth();
		} else if (burgersize.equalsIgnoreCase("One-Half")) {
			size2 = new Half();
		} else {
			System.out.println("Sorry there is no type of type you are looking for.");
		}
		return size2;
	}

}
