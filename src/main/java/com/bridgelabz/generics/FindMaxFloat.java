package com.bridgelabz.generics;

public class FindMaxFloat {
	 public static Float compareTo(Float a, Float b, Float c) {
	        if (a > b && a > c) {
	            return a;
	        } else if (b > c) {
	            return b;
	        } else {
	            return c;
	        }
	    }
	public static void main(String[] args) {
		System.out.println("Welcome to find maximum no from three float");
		System.out.println("Max Integer Nmber is: "+FindMaxFloat.compareTo(15.1F, 32.2F, 45.3F));
	}

}


