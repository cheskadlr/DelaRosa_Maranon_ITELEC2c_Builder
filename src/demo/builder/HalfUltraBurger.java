package demo.builder;

public class HalfUltraBurger extends UltraBurger{

	@Override  
    public float price() {  
        return 170.0f;  
    }  
    @Override  
    public String name() {  
        return "Ultra Burger";  
    }  
    @Override  
    public String size() {  
       return "1/2";  
    } 
	
}
