package gel37_MenuManager;

/**

* Class Salad

* author : George Li

* created: 10/14/2022

*/

/**
 * 
 * Salad has three properties, its name, its calorie count, and its description.
 *
 */

public class Salad extends MenuItem{
	public Salad() {
		super();
	}
	
	public Salad(String name, String desc, int cal) {
		this.name = name;
		this.calories = cal;
		this.description = desc;
	}

}
