package fawryTask;

import java.util.List;
import java.util.HashMap;

public class ShippingService {
	public static void sendItems(List<ShippableInter> items) {
        HashMap<ShippableInter, Integer> map = new HashMap<>();

		double TotalWeight=0;
        System.out.println("**Shipping the following items**");
        for (ShippableInter item : items) {
        	TotalWeight+=item.getWeight();
        	//System.out.println("- " + item.getName() + " (" + item.getWeight() + "kg)");
        	map.put(item,map.getOrDefault(item,0)+1);

        }
        for (ShippableInter key : map.keySet()) {
            System.out.println((int)map.get(key) +"X " + key.getName()+" "+(double)key.getWeight()*(int)map.get(key)+" kg");
        }
    	System.out.println("Total Package Weight: "+TotalWeight+" kg");
    }
}
