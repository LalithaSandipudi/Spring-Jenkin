package com.cg.demos;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static List<Integer> getZigZagList(List<Integer> l1, List<Integer> l2) {
		List<Integer> l3=new ArrayList<>();
		int i=0,
			j=1;
		
		for(i=0,j=1; i<l1.size() && j<l2.size();i=i+2,j=j+2) {
			   l3.add(l1.get(i));
			   l3.add(l2.get(j));
			   
		}
		if(i<l1.size()) {
			l3.add(l1.get(i));
			
		}
		
		
		return l3;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);

		 System.out.println(getZigZagList(list1, list2));
		//expected output : [10,200,30,400,50]
		//get even index elements from list 1, odd index elements from list 2 
		//store all in to another list and return   

	}
}
