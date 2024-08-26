package pizzaBill;
import java.util.*;
public class pizza { 
	protected int price;
	private Boolean veg;
	 
	protected int extraCheesePrice=100;
	protected int extraToppingsPrice=150;
	protected int backPackPrice=20;
	
	protected int basePizzaPrice;
	  
	
	
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeaway=false;
	  Scanner in =new Scanner(System.in);
	    
	  
	  public pizza(Boolean veg)
	  {
		  this.veg=veg;
		  
		  
		  if(this.veg)
		  {
			  this.price=300;
			  
		  }
		  else {
			  this.price=400;
			  
		  }
		  basePizzaPrice=this.price;
	  }
	public void addExtraCheese() {
		System.out.println("exta cheese(y/n)? =>");
		char ch=in.next().charAt(0);
		
		switch(ch) {
		case ('y'):
			isExtraCheeseAdded=true;
		this.price+=extraCheesePrice;
		break;
		
		case('n'):
			isExtraCheeseAdded=false;
		break;
		
		}
	}
	
	
public void addExtraToppings() {
	System.out.println("want extra toppings (y/n)? =>");
	char ch=in.next().charAt(0);
	
	switch(ch) {
	case ('y'):
		isExtraToppingsAdded=true;
	this.price+=extraToppingsPrice;
	break;
	
	case('n'):
		isExtraToppingsAdded=false;
	break;
	
	
	}}
	
	public void takeAway() {
		System.out.println("want TakeAway (y/n)? =>");
		char ch=Character.toLowerCase(in.next().charAt(0));
		
		switch(ch) {
		case ('y'):
			isOptedForTakeaway=true;
		this.price+=backPackPrice;
		break;
		
		case('n'):
			isOptedForTakeaway=false;
		break;}
	}
		
		
		
	


	
	public void getBill() {
		String bill=" ";
		
		
		System.out.println("pizza : "+ basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			bill +="Extra cheese : "+extraCheesePrice+ "\n";
		
	}
		if(isExtraToppingsAdded) {
			bill +="Extra cheese : "+extraToppingsPrice+ "\n";
		
	}

		if(isOptedForTakeaway) {
			bill +="Extra cheese : "+backPackPrice+ "\n";
		
	}
		bill +="\nTotal Amount :"+this.price+"\n";
		System.out.println(bill);
System.out.println("\n\n\nThank You !!! Visit agin.......");
System.out.println("--------------------------------------");
		
		
	}


}
