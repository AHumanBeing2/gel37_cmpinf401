package gel37_MenuManager;

/**

* Class Entree

* author : George Li

* created: 10/14/2022

*/

/**
 * 
 * Entree has three properties, its name, its calorie count, and its description.
 *
 */

public class Entree extends MenuItem{
	public Entree() {
		super();
	}

	public Entree(String name, String desc, int cal) {
		this.name = name;
		this.calories = cal;
		this.description = desc;
	}

}
