package demo.builder;

public class EighthUltraBurger extends UltraBurger{

	@Override  
    public float price() {  
        return 130.0f;  
    }  
    @Override  
    public String name() {  
        return "Ultra Burger";  
    }  
    @Override  
    public String size() {  
       return "1/8";  
    } 
	
}
