package demo.builder;

public class SmallChocolateFroyo extends ChocolateFroyo {

	@Override  
    public String name() {  
       return "Chocolate Froyo";  
    }  
  
    @Override  
    public float price() {  
        return 50.0f;  
    }  
  
    @Override  
    public String size() {  
        return "Small Size";  
    }     
	
}
