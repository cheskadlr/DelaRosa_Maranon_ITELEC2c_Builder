package demo.model.FType;

import demo.model.Fsize.FroyoSize;

public abstract class FroyoType {
	
	public abstract void setSize(FroyoSize size);

	public abstract FroyoSize getSize();
	
	public abstract String displayFroyo();
	
	public abstract String descriptionFroyo();
}
