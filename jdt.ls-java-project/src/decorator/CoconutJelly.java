package decorator;
import sale.Drink;
public class CoconutJelly extends DrinkToppings
{
	public CoconutJelly(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes Description to add Coconut Jelly
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Coconut Jelly";
	}
}
