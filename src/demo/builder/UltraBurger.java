package demo.builder;

public abstract class UltraBurger extends Burger{
	
	@Override  
    public abstract float price();  
    
	@Override  
    public abstract String name(); 
    
    @Override  
    public abstract String size(); 
}
