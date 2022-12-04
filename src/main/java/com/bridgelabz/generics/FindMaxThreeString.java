package com.bridgelabz.generics;

public class FindMaxThreeString {
	private static final FindMaxThreeString FindMaxString = null;
	public static String compareTo(String x, String y, String z) {

        int a = x.compareTo(y);
        int b = x.compareTo(z);
        int c = y.compareTo(z);
        System.out.println("a"+a+"b"+b+"c"+c);
        if (a > b && a > c) {
            return x;
        } else if (b > c) {
            return y;
        } else {
            return z;
        }
    }
	public static void main(String[] args) {
		System.out.println("Max String is:" + FindMaxString.compareTo("Apple", "Banana", "Peach"));
	}

}


