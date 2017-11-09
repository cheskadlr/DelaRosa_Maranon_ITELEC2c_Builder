package demo.builder;

public class QuarterUltraBurger extends UltraBurger{

	@Override  
    public float price() {  
        return 150.0f;  
    }  
    @Override  
    public String name() {  
        return "Ultra Burger";  
    }  
    @Override  
    public String size() {  
       return "1/4";  
    } 
	
	
}
