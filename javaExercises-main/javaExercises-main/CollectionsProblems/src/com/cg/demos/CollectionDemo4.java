package com.cg.demos;

import java.util.*;
public class CollectionDemo4
{
public static void main(String[] args)
{
String[] s1={"goa","kerala","gujarat"};
putvalues(s1);
}
public static void putvalues(String[] s1)
{
HashMap<String, String> hm = new HashMap<String, String>();
ArrayList<String> lst1 = new ArrayList<String>();
ArrayList<String> lst2 = new ArrayList<String>();
for(String s : s1)
lst1.add(s.toUpperCase().substring(0,3));
for(String s : s1)
lst2.add(s);
for(int i=0;i<s1.length;i++)
{
hm.put(lst1.get(i),lst2.get(i));
}
//System.out.println(map);
for(Map.Entry<String, String> ans: hm.entrySet())
{
System.out.println(ans.getKey()+":"+ans.getValue());
}
}
}