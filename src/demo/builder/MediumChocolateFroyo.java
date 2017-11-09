package demo.builder;

public class MediumChocolateFroyo extends ChocolateFroyo {

	@Override  
    public String name() {  
       return "Chocolate Froyo";  
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
