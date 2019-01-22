package Adapter;

import Adapter.kitchens.KoreanKitchen;

public class KoreanMenu implements KoreanKitchen {

	@Override
	public String getKorBreakfast() {
		return "rice and fish";
	}

	@Override
	public String getKorLunch() {
		return "mushrooms";
	}

	@Override
	public String getKorDinner() {
		return "spaghetti balonez";
	}

	
	
}
