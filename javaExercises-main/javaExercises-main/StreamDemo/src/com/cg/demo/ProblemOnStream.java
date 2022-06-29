package com.cg.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemOnStream {
	
	public long emptyCount(List<String>l1) {
		long count=0;
		count=l1.stream().filter(s->s=="").count();
		return count;
	}
	public long greaterLength(List<String>l1) {
		long count=0;
		count=l1.stream().filter(s->s.length()>3).count();
		return count;
	}
	public List<String>startWith(List<String>l1){
		List<String>l=new ArrayList<>();
		l=l1.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
		return l;
	}
	public List<String>refinedList(List<String>l1){
		List<String>l=new ArrayList<>();
		l=l1.stream().filter(s->s!="").collect(Collectors.toList());
		return l;
	}
	public List<String>upperCase(List<String>l2){
		List<String>l=new ArrayList<>();
		l=l2.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		return l;
	}
    
	public static void main(String[] args) {
		List<String>l1=new ArrayList<>();
		l1.add(""); l1.add(""); l1.add("aparna"); l1.add("arohi"); l1.add("bhavya"); l1.add("hi");
		 ProblemOnStream so=new  ProblemOnStream();
		
		System.out.println("no of employees : "+so.emptyCount(l1));
		System.out.println("no of strings having length greater than 3 : "+so.greaterLength(l1));
		System.out.println("string startswith a : "+so.startWith(l1));
		System.out.println("list without empty strings"+so.refinedList(l1));
		List<String>l2=new ArrayList<>();
		l2=so.refinedList(l1);
		System.out.println(so.upperCase(l2));
		
		
		
	}

}
