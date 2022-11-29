package gel37_MenuManager;

/**

* Class Dessert

* author : George Li

* created: 10/14/2022

*/

/**
 * 
 * Entree has three properties, its name, its calorie count, and its description.
 *
 */

public class Dessert extends MenuItem{
	public Dessert() {
		super();
	}
	
	public Dessert(String name, String desc, int cal) {
		this.name = name;
		this.calories = cal;
		this.description = desc;
	}
	
}
