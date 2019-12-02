package decorator;

import sale.Drink;

public class FreshStrawberries extends DrinkToppings
{
	public FreshStrawberries(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes Description to add Fresh Strawberries
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Fresh Strawberries";
	}

}
