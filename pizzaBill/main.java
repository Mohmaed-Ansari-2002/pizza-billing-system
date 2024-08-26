package pizzaBill;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------WELCOME TO PIZZA MANIA---------- ");
		System.out.println("Which Pizza You want :(1.Veg pizza 2.Non Veg Pizza   3.Deluxe Veg Pizza 4.Deluxe Non veg pizza");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		
		
		switch(ch) {
		case 1:
			pizza vegpizza=new pizza(true);
			vegpizza.addExtraToppings();
			vegpizza.addExtraCheese();
			vegpizza.takeAway();
			vegpizza.getBill();
			break;
			
		case 2:
			pizza nonvegpizza=new pizza(true);
			nonvegpizza.addExtraToppings();
			nonvegpizza.addExtraCheese();
			nonvegpizza.takeAway();
			nonvegpizza.getBill();
			break;
			
			
		case 3:
			pizza Deluxevegpizza=new pizza(true);
			Deluxevegpizza.addExtraToppings();
			Deluxevegpizza.addExtraCheese();
			Deluxevegpizza.takeAway();
			Deluxevegpizza.getBill();
			break;
		case 4:
			pizza Deluxenonvegpizza=new pizza(true);
			Deluxenonvegpizza.addExtraToppings();
			Deluxenonvegpizza.addExtraCheese();
			Deluxenonvegpizza.takeAway();
			Deluxenonvegpizza.getBill();
			break;
			
		}
	}

}
