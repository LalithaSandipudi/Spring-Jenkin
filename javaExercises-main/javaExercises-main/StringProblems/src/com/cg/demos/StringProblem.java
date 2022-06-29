package com.cg.demos;

public class StringProblem {

	public static void main(String[] args) {
		{
		    String pattern="^P[a-z\\d\\.]+q$*";
		    String line="Parooq";
		    if(line.matches(pattern))
		{
		   System.out.println("Valid String");
		}else {
		   System.out.println("Not A Valid String");
	}
		}
	}
}

