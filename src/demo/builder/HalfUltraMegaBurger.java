package demo.builder;

public class HalfUltraMegaBurger extends UltraMegaBurger{

	@Override  
    public float price() {  
        return 275.0f;  
    }  
    @Override  
    public String name() {  
        return "Ultra Mega Burger";  
    }  
    @Override  
    public String size() {  
       return "1/2";  
    } 
	
}
