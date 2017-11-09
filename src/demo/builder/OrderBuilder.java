package demo.builder;

public class OrderBuilder {
	
//	public OrderedItems prepareUltraMega(){
//	      OrderedItems meal = new OrderedItems();
//	      meal.addItems(new QuarterUltraMegaBurger());
//	      System.out.println("\n");
//	      meal.addItems(new SmallChocolateFroyo());
//	      return meal;
//	   }
	
	public OrderedItems prepareOrder(String bType, String bSize, String fFlavor, String fSize) {
		
		OrderedItems order = new OrderedItems();
		
		if(bType.equals("ultra")) {
			if(bSize.equals("half")) {
				order.addItems(new HalfUltraBurger());
			}else if(bSize.equals("quarter")) {
				order.addItems(new QuarterUltraBurger());
			}else {
				order.addItems(new EighthUltraBurger());
			}
		}else{
			if(bSize.equals("half")) {
				order.addItems(new HalfUltraMegaBurger());
			}else if(bSize.equals("quarter")) {
				order.addItems(new QuarterUltraMegaBurger());
			}else {
				order.addItems(new EighthUltraMegaBurger());
			}
		}
		
		if(fFlavor.equals("Chocolate")) {
			if(fSize.equals("Small")) {
				order.addItems(new SmallChocolateFroyo());
			}else if(fSize.equals("Medium")) {
				order.addItems(new MediumChocolateFroyo());
			}else {
				order.addItems(new LargeChocolateFroyo());
			}
		}else if(fFlavor.equals("Strawberry")) {
			if(fSize.equals("Small")) {
				order.addItems(new SmallStrawberryFroyo());
			}else if(fSize.equals("Medium")) {
				order.addItems(new MediumStrawberryFroyo());
			}else {
				order.addItems(new LargeStrawberryFroyo());
			}
		}else {
			if(fSize.equals("Small")) {
				order.addItems(new SmallVanillaFroyo());
			}else if(fSize.equals("Medium")) {
				order.addItems(new MediumVanillaFroyo());
			}else {
				order.addItems(new LargeVanillaFroyo());
			}
		}
		
		
		
//		if(burger.equals("half")){
//			order.addItems(new HalfUltraBurger());
//		}else if(burger.equals("quarter")) {
//			order.addItems(new QuarterUltraBurger());
//		}else if(burger.equals("eighth")) {
//			order.addItems(new EighthUltraBurger());
//		}else if(burger.equals("halfm")) {
//			order.addItems(new HalfUltraMegaBurger());
//		}else if(burger.equals("quaterm")) {
//			order.addItems(new QuarterUltraMegaBurger());
//		}else if(burger.equals("eighthm")) {
//			order.addItems(new EighthUltraMegaBurger());
//		}
//		
//		if(froyo.equals("smallc")){
//			order.addItems(new HalfUltraBurger());
//		}
		
	
		return order;
	}
}
