package decorator;
import sale.Drink;

public class HalfMilk extends Milk
{
	public HalfMilk(Drink base)
	{
		super(base);
	}
	
	/**
	 * changes description to add Half Milk
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nAdded: Half Milk";
	}
}
