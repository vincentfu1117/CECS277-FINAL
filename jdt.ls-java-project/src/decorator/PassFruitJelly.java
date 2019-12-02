package decorator;

import sale.Drink;

public class PassFruitJelly extends DrinkToppings 
{
	public PassFruitJelly(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes Description to add Passion Fruit Jelly
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Passion Fruit Jelly";
	}
}
