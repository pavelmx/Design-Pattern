package Adapter;

import Adapter.kitchens.RussianKitchen;

public class MenuOfDay {

	RussianKitchen russianKitchen;
	
	public MenuOfDay(RussianKitchen russianKitchen){
        this.russianKitchen = russianKitchen;
    }
	
	public void getDayMenu() {		
		System.out.println("For breakfast: " + russianKitchen.getRusBreakfast());
		System.out.println("For lunch: " + russianKitchen.getRusLunch());
		System.out.println("For dinner: " + russianKitchen.getRusDinner());
	}
}
