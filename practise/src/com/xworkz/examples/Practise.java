package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Practise {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<String>();
		collection.add("Pavithra");
		collection.add("Zombie");
		collection.add("Chweety");
		collection.add("Akashaaa");
		collection.add("Trends");
		//collection.clear();
		System.out.println(collection.contains("Akashaaa"));
		System.out.println("HashCode Method");
		System.out.println(collection.hashCode());
		System.out.println("Is Empty Method");
		System.out.println(collection.isEmpty());
		//collection.remove("Trends");
		//collection.removeAll(collection);
		System.out.println(collection.size());
		System.out.println("To Array Method");
		//System.out.println(collection.toArray());
	
		
		Collection<String> collection1 = new ArrayList<String>();
		//collection.addAll(collection);
		collection1.add("22");
		collection1.add("11");
		collection1.add("02");
		collection1.add("2017");
		
		Collection<String> sum = new ArrayList<String>();
		sum.addAll(collection);
		sum.addAll(collection1);
		System.out.println("Contains All Method");
		System.out.println(sum.containsAll(collection1));
		System.out.println("Equals method");
		System.out.println(sum.equals(collection));
		sum.retainAll(sum);
		System.out.println(sum.size());
		
		
		Iterator<String> iterator = sum.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	
		
		
	}

}
