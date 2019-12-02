package decorator;
import sale.Pastry;
public abstract class PastryExtras 
{
	protected Pastry base;
	
	public PastryExtras(Pastry base)
	{
		this.base = base;
	}
	
	/**
	 * gets descriptions
	 * @return description
	 */
	public abstract String getDescription();
	
	
}
