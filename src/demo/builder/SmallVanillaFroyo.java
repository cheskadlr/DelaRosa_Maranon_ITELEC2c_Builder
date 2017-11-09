package demo.builder;

public class SmallVanillaFroyo extends VanillaFroyo {

	@Override  
    public String name() {  
       return "Vanilla Froyo";  
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
