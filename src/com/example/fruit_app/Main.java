package com.example.fruit_app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		
		System.out.println("Fruit List (ordered by name)");
		fl.add(new Fruit(101,"Apple",1000));
		fl.add(new Fruit(102,"Orange",1500));
		fl.add(new Fruit(103,"Kiwi",2000));
		fl.add(new Fruit(104,"Banana",2500));
		fl.add(new Fruit(105,"Pear",3000));
		fl.add(new Fruit(106,"Grape",3500));
		fl.add(new Fruit(107,"Cherry",4000));
		fl.add(new Fruit(108,"Mango",4500));
		fl.add(new Fruit(109,"Watermelon",5000));
		fl.add(new Fruit(110,"Coconut",5500));
		
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for (int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
