package com.shopping.shoppingapp;

import java.util.Collection;

import com.shopping.shoppingapp.dao.ShopsDAO;
import com.shopping.shoppingapp.dao.ShopsDAOImpl;
import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShoppingMallUtil {

	public static void main(String[] args) {

		ShopsDTO shopsDTO = new ShopsDTO();
		shopsDTO.setShopId(123);
		shopsDTO.setFloor("1st floor");
		shopsDTO.setShopName("Trends");
		shopsDTO.setType("Clothing");

		/*
		 * ShopsDTO shop = new ShopsDTO(); shop.setShopId(145);
		 * shop.setShopName("Kadhims"); shop.setFloor("2nd floor");
		 * shop.setType("Footwear");
		 */

		ShopsDAO dao = new ShopsDAOImpl();
		dao.saveShop(shopsDTO);
		Collection<ShopsDTO> dtos = dao.getAllShops();
		for (ShopsDTO shopsDTO2 : dtos) {
			System.out.println(shopsDTO2);
		}
		/*
		 * dao.saveShop(shop); List<ShopsDTO> dto = dao.getAllShops(); for (ShopsDTO
		 * shopsDTO2 : dto) { System.out.println(shopsDTO2); }
		 */

		dao.updateFloorByName("3rd Floor", "Trends");

		Collection<ShopsDTO> dtos1 = dao.getAllShops();
		for (ShopsDTO shopsDTO2 : dtos1) {
			System.out.println(shopsDTO2);
		}

		dao.deleteShopByShopId(123);

		Collection<ShopsDTO> dtos2 = dao.getAllShops();
		if (dtos2 != null) {
			for (ShopsDTO shopsDTO2 : dtos2) {
				System.out.println(shopsDTO2);
			}
		} else {
			System.out.println("No collection of shop found");
		}
		

		
		 /* Collection<Object>collection = new ArrayList<Object>();
		 * collection.add("FBB"); collection.add(1); collection.add("Trends");
		 * collection.add("Zudio"); collection.add("Levis");
		 * collection.add("LifeStyle"); collection.add("PVR'S"); collection.add(340.00);
		 * collection.add(9945425303L); System.out.println(collection.spliterator());
		 * System.out.println(collection.toArray());
		 * 
		 * System.out.println(collection.size());
		 * 
		 * for (Object object : collection) { System.out.println(object); }
		 * 
		 * Iterator<Object> iterator = collection.iterator(); while(iterator.hasNext())
		 * { //hasNext() pointing to -1 location outside the gate its looking
		 * System.out.println(iterator.next());//next() will go and fetch the data }
		 * 
		 * 
		 * Collection<Object>collection1 = new HashSet<Object>();
		 * collection1.add("Apple"); collection1.add("Carrot"); collection1.add(135.00);
		 * collection1.add("Mango"); System.out.println(collection.size());
		 * 
		 * Iterator<Object> iter = collection1.iterator(); while(iter.hasNext()) {
		 * System.out.println(iter.next()); }
		 */

	}

}
