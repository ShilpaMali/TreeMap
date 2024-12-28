package com.velocity.treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

//Design HashMap<Integer,String>

public class TreeMap3 {
	public static void main(String[] args) {

		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
		hm.put(10, "ram");
		hm.put(20, "shyam");
		hm.put(15, "vikas");
		hm.put(25, "yogesh");
		// 2nd way- iterator
		Set<Integer> s = hm.keySet(); // s contain 10 20 15 25
		Iterator<Integer> itr = s.iterator(); // itr contain 10 20 15 25
		while (itr.hasNext()) { // true
			Integer key = itr.next();
			System.out.println("Key>>" + key);
			String value = hm.get(key); // hm.get(10) -> ram
			System.out.println("Value>>" + value);
		}
	}

}
