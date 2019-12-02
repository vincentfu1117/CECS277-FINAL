package factory;
import sale.*;
public abstract class SaleFactory {
	
	/**
	 * creates new Sale
	 * @param type type of Sale
	 * @param details certain required details
	 * @return Sale
	 */
	public abstract Sale makeSale(Object type, Object details);
}
