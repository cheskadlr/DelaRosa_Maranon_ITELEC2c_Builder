package demo.builder;

public class QuarterUltraMegaBurger extends UltraMegaBurger{
	
	@Override  
    public float price() {  
        return 250.0f;  
    }  
    @Override  
    public String name() {  
        return "Ultra Mega Burger";  
    }  
    @Override  
    public String size() {  
       return "1/4";  
    } 
	
}
