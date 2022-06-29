package com.cg.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemOnStreams {
	public List<Integer> squarelist(List<Integer>l1){
		List<Integer>c=new ArrayList<>();
		c=l1.stream().distinct().map(e->e*e).collect(Collectors.toList());
		return c;
	}
	public long countlist(List<Integer>l1){
		long c=0;
		c=l1.stream().mapToInt(e->e).count();
		return c;
	}
	public long minlist(List<Integer>l1) {
		c=l1.stream().
	}
	
	

	public static void main(String[] args) {
    List<Integer> l1=Arrays.asList(12,32,12,45,67,43,32);
    ProblemOnStreams so=new ProblemOnStreams();
    System.out.println("list of squares : "+so.squarelist(l1));
    System.out.println("count : "+so.countlist(l1));
    System.out.println("Max : "+so.minlist(l1));

	}

}
