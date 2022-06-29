package com.cg.demo;



	import java.util.Arrays;
	import java.util.List;import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	 
	public class ExampleProblem {
	    public static void main(String[] args)
	    {
	        List<String> colors = Arrays.asList("RED", null, "BLUE", null, "GREEN");
	 
	        List<String> list = new ArrayList<>();
	        for (String color : colors) {
	            if (color != null) {
	                list.add(color);
	            }
	        }
	        colors = list;
	 
	        System.out.println(colors);
	    }
	}



