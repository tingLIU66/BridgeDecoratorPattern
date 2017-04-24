package client;

import java.util.ArrayList;
import java.util.List;

import coffeeDeco.Chocolate;
import coffeeDeco.Cream;
import coffeeDeco.Sugar;
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
		
		Drink drink1 = new Coffee();					
		//begin decorating coffee
		drink1 = new Cream(drink1);
		drink1 = new Sugar(drink1);
		//drink1 = new Chocolate(drink1);
		//bridge pattern to connect the cupsize
		drink1.SetCups(new SmallSize());		
		drink1.OrderDrink(1);	
		drinks.add(drink1);
		
		Drink drink2 = new Coffee();	
		
		drink2 = new Chocolate(drink2);
		drink2.SetCups(new LargeSize());	
		drink2.OrderDrink(1);	
		drinks.add(drink2);

		
		Drink drink3 = new Tea();
		drink3.SetCups(new MediumSize());		
		drink3.OrderDrink(2);
		drinks.add(drink3);
		
		Drink drink4 = new SoftDrink();
		drink4.SetCups(new LargeSize());		
		drink4.OrderDrink(3);
		drinks.add(drink4);
		
		
				
		System.out.println("---------------------------------------Welcome to Ting's coffee----------------------------------------------");
		System.out.println();
		
        System.out.println("\tOrder Items: ");
        for (Drink drink0 : drinks) {
        	
        	/*System.out.println("\t\t\t" + drink0.getDrinkdescription()+ "\t\t" + drink0.getSize()+ "\t\t" 
        	        			+ "x" + drink0.getQty() + "\t\t" + "$" + drink0.cost()* drink0.getQty()* drink0.getPricerate());
		    
		    orderTotal = orderTotal + drink0.cost()* drink0.getQty();*/
		    
		    
        	System.out.printf("\t\t\t%-50s %-15s %-10s %-10s%n", 
        					drink0.getDrinkdescription(), 
        					drink0.getSize(), 
        					"x" + drink0.getQty(), 
        					"$" + drink0.cost()* drink0.getQty()* drink0.getPricerate());

        			orderTotal = orderTotal + drink0.cost()* drink0.getQty();
           	
        }
			
		
        System.out.println("\n\tOrder Total:\t" + "$" +  orderTotal);
		
        System.out.println("\n-------------------------------------------------------------------------------------------------------------");
        
	}
		
	}


