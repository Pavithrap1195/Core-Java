package com.dmart.dmartapp.dao;

import com.dmart.dmartapp.dto.ProductsDTO;

public class DmartDAOImpl implements DMartDAO {

	public ProductsDTO[] products;
	private int index;

	public DmartDAOImpl(int size) {
		products = new ProductsDTO[size];
	}

	@Override
	public boolean createProduct(ProductsDTO dto) {
		boolean productAdded = false;
		try {
			if (dto != null && !dto.getProductId().isEmpty()) {
				products[index++] = dto;
				productAdded = true;
			} else if (dto.getProductId().isEmpty()) {
				System.out.println("Cannot add Product As Product Id is empty");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productAdded;
	}

	@Override
	public ProductsDTO[] getProduct() {

		return products;
	}

	@Override
	public boolean updateProductPriceByProductName(double price, String productName) {
		boolean priceUpdated = false;
		if (price > 0 && productName != null) {
			for (ProductsDTO productsDTO : products) {
				if (productsDTO.getProductName().equals(productName)) {
					productsDTO.setPrice(price);
					priceUpdated = true;
				} else {
					System.out.println("No Product Found");
				}

			}

		}
		return priceUpdated;
	}

	@Override
	public boolean deleteByProductName(String productName) {
		boolean priceDeleted = false;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				if (products[i].getProductName().equals(productName)) {
					products[i] = null;
					priceDeleted = true;
				} else {
					System.out.println();
				}
			}

		}
		return priceDeleted;
	}

}
