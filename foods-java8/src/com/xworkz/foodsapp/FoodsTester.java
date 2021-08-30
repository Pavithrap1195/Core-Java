package com.xworkz.foodsapp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.xworkz.foodsapp.dao.FoodsDAO;
import com.xworkz.foodsapp.dao.FoodsDAOImpl;
import com.xworkz.foodsapp.dto.FoodsDTO;

public class FoodsTester {

	public static void main(String[] args) {

		Set<FoodsDTO> set = new HashSet<FoodsDTO>();
		set.add(new FoodsDTO(45, "Biryani", 120.00));
		set.add(new FoodsDTO(78, "Tomato Bath", 55.00));
		set.add(new FoodsDTO(12, "Dosa", 65.00));
		
		System.out.println("Fetching set through method reference");
		set.forEach(System.out::println);
		
		System.out.println("Fetching set through Lambda Expression");
		Consumer<Set<FoodsDTO>> consumer = (f)->System.out.println(set);
		consumer.accept(set);
		
		System.out.println("Using method reference");
		FoodsDAO food = FoodsDAOImpl :: delicious;
		food.delicious();
		
		System.out.println("Using Lambda Expression");
		FoodsDAO food1 = ()->System.out.println("Foods are very delicious");
		food1.delicious();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
