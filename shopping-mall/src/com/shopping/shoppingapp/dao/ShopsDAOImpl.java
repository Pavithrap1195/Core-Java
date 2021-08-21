package com.shopping.shoppingapp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShopsDAOImpl implements ShopsDAO {

	public Collection<ShopsDTO> dtos = new ArrayList<ShopsDTO>();

	public ShopsDAOImpl() {

	}

	@Override
	public void saveShop(ShopsDTO shopsDTO) {
		if (shopsDTO != null) {
			dtos.add(shopsDTO);
			System.out.println("Shop details added");
		} else {
			System.out.println("Shop is empty");
		}
	}

	@Override
	public Collection<ShopsDTO> getAllShops() {
		if (dtos != null && !dtos.isEmpty()) {
			return dtos;
		}
		return null;
	}

	@Override
	public void updateFloorByName(String flr, String name) {
		if (flr != null && name != null) {
			for (ShopsDTO shopsDTO : dtos) {
				if (name.equals(shopsDTO.getShopName())) {
					shopsDTO.setFloor(flr);
				}
			}

		}

	}

	@Override
	public void deleteShopByShopId(int id) {
		if(id>0) {
			Iterator<ShopsDTO> itr = dtos.iterator();
			while(itr.hasNext()) {
				ShopsDTO shopsDTO = itr.next();
				if(id==shopsDTO.getShopId()) {
					itr.remove();
					System.out.println("Shop details deleted");
				}
				/*for (ShopsDTO shopsDTO : dtos) {
					if (id == shopsDTO.getShopId()) {
						dtos.remove(shopsDTO);
						System.out.println("Shop details deleted");
					}
				}*/
			}
		} 
	}
}
