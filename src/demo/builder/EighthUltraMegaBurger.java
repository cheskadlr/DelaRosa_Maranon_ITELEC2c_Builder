package demo.builder;

public class EighthUltraMegaBurger extends UltraMegaBurger{

	@Override  
    public float price() {  
        return 230.0f;  
    }  
    @Override  
    public String name() {  
        return "Ultra Mega Burger";  
    }  
    @Override  
    public String size() {  
       return "1/8";  
    } 
	
}
