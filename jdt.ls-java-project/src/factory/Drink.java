package factory;

public abstract class Drink extends Sale{

	/**
	 * passes getDescription to subclasses
	 */
	public abstract String getDescription();

	/**
	 * passes getCost to subclasses
	 */
	public abstract double getCost();

}
