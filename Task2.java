package com.tka.oct_14;

import java.util.ArrayList;

//Second Highest

public class Task2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(35);
		al.add(40);
		
		 Integer highest = null;
	        Integer second = null;

	        for (int n : al) {
	            if (highest == null || n > highest) {
	                second = highest;
	                highest = n;
	            } else if (n != highest &&
	                    (second == null || n > second)) {
	                second = n;
	            }
	        }

	        if (second == null) {
	            System.out.println("Second-highest number not available");
	        } else {
	            System.out.println("Second Highest: " + second);
	        }
		
	}
}
