package demo.builder;

public class MediumStrawberryFroyo extends StrawberryFroyo {

	@Override  
    public String name() {  
       return "Strawberry Froyo";  
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
