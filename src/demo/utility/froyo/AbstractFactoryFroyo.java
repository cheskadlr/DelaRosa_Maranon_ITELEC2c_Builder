package demo.utility.froyo;

import demo.model.Fsize.*;
import demo.model.FType.*;

public interface AbstractFactoryFroyo {
	
	FroyoType getFroyo(String type);
	
	FroyoSize getSize(String froyosize);

}
