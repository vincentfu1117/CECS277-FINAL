package decorator;

import sale.Drink;

public class LycheeJelly extends DrinkToppings
{
	public LycheeJelly(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes Description to add Lychee Jelly
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Lychee Jelly";
	}
}
