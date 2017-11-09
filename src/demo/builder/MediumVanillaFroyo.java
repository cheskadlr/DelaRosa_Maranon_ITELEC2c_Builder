package demo.builder;

public class MediumVanillaFroyo extends VanillaFroyo {

	@Override  
    public String name() {  
       return "Vanilla Froyo";  
    }  
  
    @Override  
    public float price() {  
        return 75.0f;  
    }  
  
    @Override  
    public String size() {  
        return "Medium Size";  
    }  
}
