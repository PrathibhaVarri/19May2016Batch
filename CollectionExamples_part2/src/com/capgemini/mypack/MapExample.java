package com.capgemini.mypack;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class MapExample {
	
	public static void main(String[] args) {
		/*HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1, "one");
		hm.put(2, "two");
		System.out.println(hm);
		
		
		System.out.println("by using keyset");
		Set<Integer> set = hm.keySet();
		
		System.out.println(set);
		
		Set<Entry<Integer, String>> set2 =hm.entrySet();
		Iterator<Entry<Integer, String>> it = set2.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me = it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(null);
		v.add(2);
		v.add(null);
		System.out.println("Vector "+v);
		*/
		
		
		
		
		
		
		
		/*Integer[] num={7,5,7,3};
		
		Set<Integer> set=new TreeSet<>(Arrays.asList(num));
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		set.add(44);
		
		for(Integer obj:set)
		{
			System.out.println(obj);
		}
		*/
		
		SortedMap sMap=new TreeMap();
		
		sMap.put(5,"emp1");
		sMap.put(6,"emp1");
		sMap.put(7,"emp1");
		
		
		System.out.println(sMap.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
