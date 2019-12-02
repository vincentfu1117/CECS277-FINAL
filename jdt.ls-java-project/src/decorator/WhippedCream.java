package decorator;
import sale.Drink;
public class WhippedCream extends DrinkToppings
{
	public WhippedCream(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes description to add Whipped Cream
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Whipped Cream";
	}

}
