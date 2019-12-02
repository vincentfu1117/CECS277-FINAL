package decorator;

import sale.Drink;

public class SoyMilk extends Milk
{
	public SoyMilk(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes Description to add Soy Milk
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Soy Milk";
	}
}
