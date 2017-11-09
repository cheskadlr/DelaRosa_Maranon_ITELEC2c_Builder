package demo.model.FType;

import demo.model.Fsize.FroyoSize;

public class Vanilla extends FroyoType {

	private FroyoSize size;
	
	@Override
	public String displayFroyo() {
		return"Vanilla Flavored Froyo";
	}
	
	@Override
	public String descriptionFroyo() {
		return"Tastes like milk. Hmmm yummy!";
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
