package demo.builder;

public class LargeChocolateFroyo extends ChocolateFroyo {

	@Override  
    public String name() {  
       return "Chocolate Froyo";  
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
