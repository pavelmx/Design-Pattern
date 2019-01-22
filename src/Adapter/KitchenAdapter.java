package Adapter;

import Adapter.kitchens.KoreanKitchen;
import Adapter.kitchens.RussianKitchen;

public class KitchenAdapter implements RussianKitchen{

	KoreanKitchen koreanKitchen;
	
	public KitchenAdapter(KoreanKitchen koreanKitchen){
        this.koreanKitchen = koreanKitchen;
    }
	
	@Override
	public String getRusBreakfast() {
		return koreanKitchen.getKorBreakfast();
	}

	@Override
	public String getRusLunch() {
		return koreanKitchen.getKorLunch();
	}

	@Override
	public String getRusDinner() {
		return koreanKitchen.getKorDinner();
	}


}
