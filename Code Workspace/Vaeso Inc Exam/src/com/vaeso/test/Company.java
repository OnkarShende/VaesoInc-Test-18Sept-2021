package com.vaeso.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {

	public Map<String, Integer> productslist() {

		// Defining products with their values using Map<key, Value> concept
		Map<String, Integer> products = new HashMap<String, Integer>();
		products.put("MI TV", 17999);
		products.put("Dell Laptop", 23000);
		products.put("Redmi Note 8 ", 20000);
		products.put("MackBook Charger", 12000);
		products.put("Microwave Oven", 16000);
		products.put("Cannon Camera", 25000);
		products.put("IPods", 11000);
		
		// Determining All Available Products by iterating map
		System.out.println("----------------------------------------------------------------------");
		System.out.println("All Availabe Products with their Prices are");
		System.out.println("----------------------------------------------------------------------");
		Set<String> keyset = products.keySet();
		for (String allproducts : keyset) {
			System.out.println(allproducts + ":" + products.get(allproducts));
		}
		System.out.println("----------------------------------------------------------------------");

		// No of Employees that receives Goodie
		System.out.println("Number of Employees that Receives Goodie are " + 5);
		System.out.println("----------------------------------------------------------------------");

		// 5 Products that are distributed among Employees are 
		int i = 0;
		Map<String, Integer> empgoodie = new HashMap<String, Integer>();
		for (String allproducts : keyset) {
			empgoodie.put(allproducts, products.get(allproducts));
			i++;

			if (i > 4) {
				break;
			}
		}

		// 5 products with their prices that are going to distribute among 5 Employees
		System.out.println("5 Products distributing with their prices are");
		System.out.println("----------------------------------------------------------------------");
		Set<String> empgoodiekeyset = empgoodie.keySet();
		for (String allproducts : empgoodiekeyset) {
			System.out.println(allproducts + ":" + products.get(allproducts));
		}
		System.out.println("----------------------------------------------------------------------");

		// Finding maximum and minimum values among 5 products and difference between
		// max and min value.
		List<Integer> values = new ArrayList<Integer>();
		values.addAll(empgoodie.values());
		int max = Collections.max(values);
		int min = Collections.min(values);
		int difference = max-min;

		System.out.println("Maximim Value is " + max + " and Minimum Value is " + min);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Difference between the chosen goodie with highestprice and " + 
							"the lowest price is " + difference);
		return products;
	}

	public static void main(String[] args) {

		Company comp = new Company();
		Map<String, Integer> allprods = comp.productslist();

	}

}
