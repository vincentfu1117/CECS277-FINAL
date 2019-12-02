package sale;

public class Coffee extends Drink{
	
	private String description = "Coffee: ";
	
	private double cost = 0.00;
	
	private Size size;
	
	public Coffee(Size size)
	{
		this.size = size;
	}
	
	/**
	 * returns description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * adjusts cost depending on Size
	 */
	public double getCost()
	{
		switch(this.size) 
		{
			case Small:
				return 2.00;
			case Medium:
				return 2.50;
			case Large:
				return 3.00;
		}
		return cost;
	}

}
