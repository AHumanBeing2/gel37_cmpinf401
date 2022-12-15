package gel37_MenuManager;

import java.util.ArrayList;

public class testforassignmentthree {

	public static void main(String[] args) {
		MenuManager menumanager = new MenuManager("data/dishes.txt");
		Menu hi = new Menu("hi");
		System.out.println(menumanager.getEntrees().get(0).getDescription());
		hi = menumanager.randomMenu("iyfig7iyf");
		ArrayList<Menu> Menus = new ArrayList<>();
		Menus.add(hi);
		FileManager.writeMenu("data/Menus.txt", Menus);
	}

}
