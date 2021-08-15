package com.dmart.dmartapp.dao;

import com.dmart.dmartapp.dto.ProductsDTO;

public interface DMartDAO {
	
	public boolean createProduct(ProductsDTO dto);

	public ProductsDTO[] getProduct();
	
	public boolean updateProductPriceByProductName(double price,String productName);

	public boolean deleteByProductName(String productName);
}


