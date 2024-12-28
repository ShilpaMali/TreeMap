package com.velocity.treemap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap4 {
	public static void main(String[] args) {

		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
		hm.put(10, "ram");
		hm.put(20, "shyam");
		hm.put(15, "vikas");
		hm.put(25, "yogesh");
		// 2nd way- using for each loop- preferred way
		Set<Integer> s = hm.keySet(); // s contain 10 20 15 25
		for(Integer i: s) {
			System.out.println("Key>>"+i);
			System.out.println("Value>>"+hm.get(i));
		}
	}

}
