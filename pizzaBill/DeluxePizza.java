package pizzaBill;

public class DeluxePizza extends pizza {
	public DeluxePizza(Boolean veg)
	{
		super(veg);
	}
	
	public void addExtraCheese() {
		this.price+=extraCheesePrice;
	}
	
	public void addExtraToppings() {
		this.price+=extraToppingsPrice;
	}
	
	
}
