package decorator;
import sale.Drink;
public class Boba extends Toppings{

	public Boba(Drink base)
	{
		super(base);
    base.cost +=.5;
	}
	
	/**
	 * changes Description to add Boba
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Boba";
	}
}
