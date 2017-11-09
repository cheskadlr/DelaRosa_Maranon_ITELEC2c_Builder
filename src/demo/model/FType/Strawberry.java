package demo.model.FType;

import demo.model.Fsize.FroyoSize;

public class Strawberry extends FroyoType {

	private FroyoSize size;
	
	@Override
	public String displayFroyo() {
		return"Strawberry Flavored Froyo";
	}
	
	@Override
	public String descriptionFroyo() {
		return"Like real strawberries";
	}

	@Override
	public void setSize(FroyoSize size) {
		this.size = size;

	}

	@Override
	public FroyoSize getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
