package demo.utility.froyo;

import demo.model.Fsize.*;
import demo.model.FType.*;


public class FroyoTypeFactory implements AbstractFactoryFroyo{

	@Override
	public FroyoType getFroyo(String type) {
		FroyoType froyotype2 = null;

		if (type.equalsIgnoreCase("Strawberry")) {
			froyotype2 = new Strawberry();
		} else if (type.equalsIgnoreCase("Chocolate")) {
			froyotype2 = new Chocolate();
		} else if (type.equalsIgnoreCase("Vanilla")) {
			froyotype2 = new Vanilla();
		} else {
			System.out.println("Sorry there is no type of type you are looking for.");
		}
		return froyotype2;
	}

	@Override
	public FroyoSize getSize(String froyosize) {
		// TODO Auto-generated method stub
		return null;
	}

}
