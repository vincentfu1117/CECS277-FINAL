package sale;

public class Cookie extends Pastry{
	
	private String description = "Cookie: ";
	private double cost = 1.00;
	private int amount = 0;
	public Cookie(int amount)
	{
		this.amount = amount;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public double getCost()
	{
		return cost; //TODO: change cost and add special discounting for amount
	}

}
