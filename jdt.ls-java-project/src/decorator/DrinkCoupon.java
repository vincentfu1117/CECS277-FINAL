package decorator;
import sale.Drink;

public class DrinkCoupon extends DrinkExtras
{	
	public DrinkCoupon(Drink base)
	{
		super(base);
	}
	
	/**
	 * edits description to add Discount message
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nDiscount: 50% Off Highest Priced Drink";
	}
	
	/**
	 * halves the cost of this drink
	 * @return half the cost
	 */
	public double getCost()
	{
		return (base.getCost()/2);
	}
}
