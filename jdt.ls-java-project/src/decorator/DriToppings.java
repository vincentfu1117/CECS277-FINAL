package decorator;
import sale.Drink;
public abstract class DrinkToppings extends DrinkExtras{
		
	public DrinkToppings(Drink base)
	{
		super(base);
	}
	
	/**
	 * passes method to subclasses
	 */
	public abstract String getDescription();
	
	/**
	 * edits cost for all DrinkToppings variants
	 */
	public double getCost()
	{
		return base.getCost() + .75;
	}

}
