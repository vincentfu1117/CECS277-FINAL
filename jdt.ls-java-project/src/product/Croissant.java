package sale;

public class Croissant extends Pastry{
	
	private String description = "Croissant: ";
	
	private double cost = 3.00;
	
	private int amount = 0;
	
	private String heat;
	
	public Croissant(String heat, int amount)
	{
		this.heat = heat;
		this.amount = amount;
	}
	
	/**
	 * returns description
	 */
	public String getDescription() 
	{
		description += "" + amount;
		if(heat.equals("Heat"))
		{
			description += "Heated";
		}
		return description;
	}
	
	/**
	 * returns cost
	 */
	public double getCost()
	{
		if(heat.equals("Heat"))
		{
			cost += .50;
		}
		cost = cost * amount;
		return cost;
	}
	
	

}
