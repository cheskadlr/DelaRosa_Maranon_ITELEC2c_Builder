package demo.model.FType;

import demo.model.Fsize.FroyoSize;

public class Chocolate extends FroyoType {

	private FroyoSize size;
	
	@Override
	public String displayFroyo() {
		return"Chocolate Flavored Froyo";
	}
	
	@Override
	public String descriptionFroyo() {
		return"Fresh from cocoa";
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
