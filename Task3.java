package com.tka.oct_14;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task3 {
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(20);
		al1.add(35);
		al1.add(40);
		
		al2.add(11);
		al2.add(22);
		al2.add(30);
		al2.add(20);
		al2.add(333);
		al2.add(44);
		
		LinkedHashSet<Integer> common = new LinkedHashSet<>();
		LinkedHashSet<Integer> different = new LinkedHashSet<>();
		
		for(int n : al1) {
			if(al2.contains(n)) {
				common.add(n);
			}else {
				different.add(n);
			}
		}
		
		System.out.println("C");
		

	}
}
