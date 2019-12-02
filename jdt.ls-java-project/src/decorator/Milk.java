package decorator;
import sale.*;
public abstract class Milk extends DrinkExtras{
	
	/**
	 * accepts Drink as argument
	 * @param base the Drink
	 */
	public Milk(Drink base)
	{
		super(base);
	}
	
	/**
	 * passes Description as abstract method
	 */
	public abstract String getDescription();
	
	/**
	 * increases cost for all Milk variants
	 */
	public double getCost()
	{
		return base.getCost() + .75;
	}


}
