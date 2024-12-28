package com.velocity.treemap;

import java.util.TreeMap;

public class TreeMap5 {
	// Design method which return treemap object to that method
		public static TreeMap getHashMapDemo() {
			TreeMap hm=new TreeMap();
			hm.put(10, "ram");
			hm.put(20, "shyam");
			hm.put(15, "vikas");
			hm.put(25, "yogesh");
			return hm;
		}

		public static void main(String[] args) {
			TreeMap hm1 = getHashMapDemo();
			System.out.println(hm1);

		}

}
