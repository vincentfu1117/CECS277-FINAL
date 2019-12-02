package decorator;
import sale.Sale;
public class GeneralCoupon extends Sale
{
	protected Sale base;
	
	public GeneralCoupon(Sale base)
	{
		this.base = base;
	}
	
	/**
	 * edits description to add general coupon
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nDiscount: $2 Off Purchase of At Least $10";
	}
	
	/**
	 * edits cost to remove $2
	 */
	public double getCost()
	{
		return base.getCost() - 2.00;
	}
}
