package com.tka.oct_14;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(11);
		al.add(22);
		al.add(11);
		al.add(44);
		al.add(22);
		al.add(33);
		al.add(55);
		al.add(11);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		
		
		System.out.println("Original List : " + al);
		System.out.println("List after removing Duplicates : " + lhs);
		System.out.println("No. of Unique elements : " + lhs.size());
		
	}

}
