package com.cg.demo;
	import java.util.List;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.stream.Collectors;

	public class StreamOperations {

	        public List <Integer>squares(List<Integer> list){
	        List <Integer> l1 = new ArrayList<>();
	        l1 =list.stream().distinct().map(i->i*i).collect(Collectors.toList());
	        return l1;
	}
	        public long countNum (List <Integer> list){
	                long count=0;
	                count = list.stream().map(e->e).count();
	                return count;

	}
	       public int minNum (List <Integer> list){
	               int min =0;
	               min = list.stream().mapToInt(i->i).min().getAsInt();
	                 return min;
	}

	        public int maxNum (List <Integer> list){
	              int max=0;
	              max = list.stream().mapToInt(i->i).max().getAsInt();
	                return max;
	}
	     public Double avgOfList(List <Integer> list){
	               Double avg=0.0;
	               avg= list.stream().mapToInt(i->i).average().getAsDouble();
	               return avg;
	}

	public static void main (String[] args){
	             List<Integer> list = Arrays.asList(56,33,87,45,56,87,27,65);
	             StreamOperations  io = new StreamOperations ();

	                  System.out.println("Squares of numbers : "+io.squares(list));
	                  System.out.println("No of elements in list :"+io.countNum (list));
	                  System.out.println("Minimum number of the list : "+io.minNum(list));
	                  System.out.println("Maximum number of the list :"+io.maxNum(list));
	                  System.out.println("Average of the list : "+io.avgOfList(list));
	}
	}


