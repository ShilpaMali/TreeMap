package com.velocity.treemap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {

		TreeMap hm=new TreeMap();
		hm.put(10, "ram");
		hm.put(20, "shyam");
		hm.put(15, "vikas");
		hm.put(25, "yogesh");
		// 2nd way- using for each loop- preferred way
		Set s = hm.keySet(); // s contain 10 20 15 25
		for(Object i: s) {
			System.out.println("Key>>"+i);
			System.out.println("Value"+hm.get(i));
		}
	}

}
