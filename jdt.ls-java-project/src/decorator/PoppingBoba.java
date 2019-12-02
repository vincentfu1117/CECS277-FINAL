package decorator;

import sale.Drink;

public class PoppingBoba extends DrinkToppings
{
	public PoppingBoba(Drink base) {
		super(base);
    base.cost += .5;
	}
	@Override
	public String getDescription(){
  return base.getDescription() + "\nAdded: popping boba";
  }
	@Override
	public double getCost() {
		return base.getCost();
    //or whatever popping boba cost
	}
	public void setCost(double c){
      base.cost() = c;
  }

}
