package sale;

public class Tea extends Drink{
	
	private String description = "Tea: ";
	
	private double cost = 0.00;
	
	private Size size;

	public Tea(Size size)
	{
		this.size = size;
	}
	
	/**
	 * adjusts cost depending on Size
	 */
	public double getCost()
	{
		switch(this.size) 
		{
			case Small:
				return 1.50;
			case Medium:
				return 2.00;
			case Large:
				return 2.50;
		}
		return cost;
	}
	
	/**
	 * returns description
	 */
	public String getDescription()
	{
		return description;
	}

}
