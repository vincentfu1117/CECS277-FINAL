package factory;

public abstract class Pastry extends Sale{
	
	/**
	 * passes getDescription to subclasses
	 */
	public abstract String getDescription();

	/**
	 * passes getCost to subclasses
	 */
	public abstract double getCost();

}
