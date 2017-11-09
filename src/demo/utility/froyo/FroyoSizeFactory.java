package demo.utility.froyo;

import demo.model.Fsize.*;
import demo.model.FType.*;


public class FroyoSizeFactory implements AbstractFactoryFroyo{

	@Override
	public FroyoType getFroyo(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FroyoSize getSize(String froyosize) {
		FroyoSize size2 = null;

		if (froyosize.equalsIgnoreCase("Small")) {
			size2 = new Small();
		} else if (froyosize.equalsIgnoreCase("Medium")) {
			size2 = new Medium();
		} else if (froyosize.equalsIgnoreCase("Large")) {
			size2 = new Large();
		} else {
			System.out.println("Sorry there is no type of type you are looking for.");
		}
		return size2;
	}

}
