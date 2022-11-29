package gel37_MenuManager;

/**

* Class MenuTest

* author : George Li

* created: 10/14/2022

*/



public class MenuTest {
	public static void main(String[] args) {

	//Menu 1 uses all dish types
	
	String menuName1 = "Menu 1";
	Entree entree = new Entree("Sirloin Steak", "A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked. ", 20);
	Dessert dessert = new Dessert("Ice Cream", "Is cold, is sweet, is yummy", 300);
	Side side = new Side("Slider", "Small burger", 4);
	Salad salad = new Salad("Lettuce","Crunchy, leafy, green plant", 4000);

	//should be net calories of 4324
	
	Menu menu1 = new Menu(menuName1, entree, side, salad, dessert);

	System.out.println(menu1.getName());
	System.out.println("Calories: " + menu1.totalCalories());
	System.out.println(menu1.description());
	
	//Menu2 should be 24 Calories total, and only contains Entree and Side dish types.
	
	String menuName2 = "Menu 2";
	Entree entree2 = new Entree("Sirloin Steak", "A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked. ", 20);
	Side side2 = new Side("Slider", "Small burger", 4);
	
	Menu menu2 = new Menu(menuName2, entree2, side2);
	
	System.out.println(menu2.getName());
	System.out.println("Calories: " + menu2.totalCalories());
	System.out.println(menu2.description());

	}
}