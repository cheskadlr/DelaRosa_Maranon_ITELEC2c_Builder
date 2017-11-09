package demo.utility.burger;

import demo.model.Bsize.*;
import demo.model.Fsize.FroyoSize;
import demo.model.BType.*;

public interface AbstractFactoryBurger {
	
	BurgerType getBurger(String type);
	
	BurgerSize getSize(String burgersize);

}
