package decorator;
import sale.Drink;
public class GrassJelly extends DrinkToppings 
{
	public GrassJelly(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes Description to add Grass Jelly
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Grass Jelly";
	}
}
