package demo.builder;

public class LargeStrawberryFroyo extends StrawberryFroyo {

	@Override  
    public String name() {  
       return "Strawberry Froyo";  
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
