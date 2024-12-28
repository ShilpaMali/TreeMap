package com.velocity.treemap;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMapDemo hm = new TreeMapDemo();
		hm.put(10, "ram"); //put() is used to add elements
		hm.put(20, "ram");
		hm.put(15, "vikas");
		hm.put("pune", "yogesh"); //String,String-Integer,Integer,
		// first way
		//hm.put(null,"sandip"); //can we pass key as null in hashmap ? yes we can 
		//hm.put(40,null); //can we pass value as null in hashmap ? yes
		//hm.put(null,null); //can we pass both as null ? yes
		System.out.println(hm);
	}

	private void put(int i, String string2) {
		// TODO Auto-generated method stub
		
	}

	private void put(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
