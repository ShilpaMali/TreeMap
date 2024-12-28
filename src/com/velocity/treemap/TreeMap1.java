package com.velocity.treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {

		TreeMap hm=new TreeMap();
		hm.put(10, "ram");
		hm.put(20, "shyam");
		hm.put(15, "vikas");
		hm.put(25, "yogesh");
		// 2nd way- iterator
		Set s = hm.keySet(); // s contain 10 20 15 25
		Iterator itr = s.iterator(); // itr contain 10 20 15 25
		while (itr.hasNext()) { // true
			Object obj = itr.next();
			System.out.println("Key>>" + obj);
			Object obj1 = hm.get(obj); // hm.get(10) -> ram
			System.out.println("Value>>" + obj1);
		}
	}

}
