package decorator;
import sale.Drink;

public abstract class DrinkExtras extends Drink
{
	protected Drink base;
	
	public DrinkExtras(Drink base)
	{
		this.base = base;
	}
	
	public abstract String getDescription();
	
}
