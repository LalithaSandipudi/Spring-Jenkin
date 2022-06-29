package com.cg.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*Create a program to get the HashMap from the given input string array 
 where the key for the HashMap is first three letters of array element in Upper Case 
 and the value of HashMap is the element itself
 
Input:{�goa�,�kerala�,�gujarat�} [string array]
Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
*/

public class CollectionDemo3 {

	public static HashMap<String, String> getEntries(String array[]) {
		ArrayList<String>l1=new ArrayList<String>();
		HashMap<String,String>m1=new HashMap<String,String>();
		ArrayList<String>l2=new ArrayList<String>();
		for(String s:array)
			l1.add(s.toUpperCase().substring(0,3));
		for(String s:array)
			l2.add(s);
		for(int i=0;i<l1.size();i++)
			m1.put(l1.get(i),l2.get(i));
		System.out.println(m1);
		return m1;
	}

	public static void main(String[] args) {

		String array[] = { "goa", "kerala", "gujarat" };
		getEntries(array);
	}
}
