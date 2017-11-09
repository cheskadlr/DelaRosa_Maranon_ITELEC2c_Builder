package demo.builder;

public class LargeVanillaFroyo extends VanillaFroyo {

	@Override  
    public String name() {  
       return "Vanilla Froyo";  
    }  
  
    @Override  
    public float price() {  
        return 85.0f;  
    }  
  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
}
