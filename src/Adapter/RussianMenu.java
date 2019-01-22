package Adapter;

import Adapter.kitchens.RussianKitchen;

public class RussianMenu implements RussianKitchen {

	@Override
	public String getRusBreakfast() {
		return "pancakes";
	}

	@Override
	public String getRusLunch() {
		return "soup and draniki";
	}

	@Override
	public String getRusDinner() {
		return "patoto with salo";
	}
	
	

}
