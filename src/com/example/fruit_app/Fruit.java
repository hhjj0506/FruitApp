package com.example.fruit_app;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit(int i, String string, int j) {
		this.no = i;
		this.name = string;
		this.price = j;
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}

class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare (Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit> {
	@Override
	public int compare (Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}
