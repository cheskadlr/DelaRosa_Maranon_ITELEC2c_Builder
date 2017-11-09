package demo.model.BType;

import demo.model.Bsize.BurgerSize;

public abstract class BurgerType {
	
		public abstract void setSize(BurgerSize size);
		
		public abstract BurgerSize getSize();
		
		public abstract String displayBurger();
		
		public abstract String descriptionBurger();
	
}
