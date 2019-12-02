package sale;

public class Macaroon extends Pastry{
	
	private String description = "Macaroon: ";
	private double cost = 1.50;
	private int amount = 0;
	public Macaroon() 
	{
		
	}
	/**
	 * returns description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * returns cost
	 */
	public double getCost()
	{
		return cost; //TODO: change cost and add special discounting for amount
	}

}
