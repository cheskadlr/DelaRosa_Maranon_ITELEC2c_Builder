package demo.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderBuilder builder=new OrderBuilder();  
        
        OrderedItems orderedItems=builder.prepareUltraMega();  
          
        orderedItems.showItems();  
          
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
		
	}

}
