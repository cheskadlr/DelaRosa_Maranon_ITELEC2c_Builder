package demo.builder;

public class SmallStrawberryFroyo extends StrawberryFroyo {

	@Override  
    public String name() {  
       return "Strawberry Froyo";  
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
