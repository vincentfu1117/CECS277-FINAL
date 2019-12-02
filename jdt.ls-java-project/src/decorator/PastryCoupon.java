package decorator;
import sale.Pastry;
public class PastryCoupon extends PastryExtras
{
	public PastryCoupon(Pastry base)
	{
		super(base);
	}
	
	/**
	 * edits description to add $1 discount
	 */
	public String getDescription()
	{
		return base.getDescription() + "\nDiscount: $1 off cookie purchase";
	}
	
	/**
	 * edits cost to remove one dollar
	 * @return cost - 1
	 */
	public double getCost()
	{
		return base.getCost() - 1.00;
	}
}
