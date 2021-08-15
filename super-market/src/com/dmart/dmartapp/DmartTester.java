package com.dmart.dmartapp;

import java.util.Scanner;

import com.dmart.dmartapp.dao.DMartDAO;
import com.dmart.dmartapp.dao.DmartDAOImpl;
import com.dmart.dmartapp.dto.ProductsDTO;

public class DmartTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		DMartDAO dMartDAO = new DmartDAOImpl(size);
		
		for(int i = 0;i < size; i++) {
			
			ProductsDTO dto =new ProductsDTO();
			dto.setProductId(sc.next());
			dto.setProductName(sc.next());
			dto.setBrandName(sc.next());
			dto.setPrice(sc.nextDouble());
			dto.setQuality(sc.next());
			dto.setProductType(sc.next());
			
			dMartDAO.createProduct(dto);
			
		}
		
		ProductsDTO[] productDTOs = dMartDAO.getProduct();
		for (ProductsDTO productsDTO : productDTOs) {
			System.out.println(productsDTO);
			
		}
		
		System.out.println("Enter the Price to update with name");
		dMartDAO.updateProductPriceByProductName(sc.nextDouble(),sc.next());
		
		ProductsDTO[] productDTOs1 = dMartDAO.getProduct();
		for (ProductsDTO productsDTO : productDTOs1) {
			System.out.println(productsDTO);
		
	}
		
		System.out.println("Enter the Product Name to be deleted");
		dMartDAO.deleteByProductName(sc.next());
		
		ProductsDTO[] productDTOs2 = dMartDAO.getProduct();
		for (ProductsDTO productsDTO : productDTOs2) {
			System.out.println(productsDTO);

	}
}
}