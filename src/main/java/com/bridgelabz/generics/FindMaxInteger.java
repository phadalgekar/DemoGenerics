package com.bridgelabz.generics;

public class FindMaxInteger {
	public static Integer compareTo(Integer a,Integer b,Integer c)
    {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

	public static void main(String[] args) {
		 System.out.println("Welcome to find maximum no from three integer");
	     System.out.println("Max Integer Nmber is: "+FindMaxInteger.compareTo(15, 32, 45));
	}

}


