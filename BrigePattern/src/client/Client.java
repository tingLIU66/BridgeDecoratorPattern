package client;

import java.util.ArrayList;
import java.util.List;


import cup.LargeSize;
import cup.MediumSize;
import cup.SmallSize;
import drink.Coffee;
import drink.Drink;
import drink.SoftDrink;
import drink.Tea;

public class Client {
	
	
	
	public static void  main(String args[]){
		
		List<Drink> drinks= new ArrayList<Drink>();
		float orderTotal = 0f;

		Drink drink;		
		drink = new Coffee();	
		drink.setDrinkname("coffee");
		((Coffee) drink).setAddmilk("No milk");
		drink.setPrice(2.5f);
		drink.SetCups(new SmallSize());		
		drink.OrderDrink(1);	
		drinks.add(drink);

		
		drink = new Tea();
		drink.setDrinkname("Tea");
		((Tea) drink).setTeatype("Jasmine");
		drink.setPrice(2.0f);
		drink.SetCups(new MediumSize());		
		drink.OrderDrink(2);
		drinks.add(drink);
		
		drink = new SoftDrink();
		drink.setDrinkname("Cocca");
		((SoftDrink) drink).setBrand("Pepsi");
		drink.setPrice(3.0f);
		drink.SetCups(new LargeSize());		
		drink.OrderDrink(3);
		drinks.add(drink);
		
		
				
		System.out.println("-------------------------------Welcome to Ting's coffee--------------------------------------");
		System.out.println();
		
        System.out.println("\tOrder Items: ");
        for (Drink drink0 : drinks) {
        	
        	System.out.print("\t\t\t" + drink0.getDrinkname()+ "\t\t" );

        			    if( drink0 instanceof Coffee)
        			    	System.out.print(((Coffee) drink0).getAddmilk()+"\t\t");
        			    		 
        			     else if ( drink0 instanceof Tea)
        			    	System.out.print(((Tea) drink0).getTeatype()+"\t\t");
        			    
        			    else if ( drink0 instanceof SoftDrink)
							System.out.print(((SoftDrink) drink0).getBrand()+"\t\t");
        			    		 
		    System.out.println(	drink0.getSize()+ "\t\t" + "x" + drink0.getQty() + "\t\t" + "$" + drink0.getTotalPrice()* drink0.getQty());
		    
		    orderTotal = orderTotal + drink0.getTotalPrice()* drink0.getQty();
           	
           	
        }
		
			
		
        System.out.println("\n\tOrder Total:\t" + "$" +  orderTotal);
		
        System.out.println("\n---------------------------------------------------------------------------------------------");
		
		
	}

}
