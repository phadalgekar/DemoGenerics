package com.bridgelabz.generics;

public class RefactorOne {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //assume x initially largest
        if (y.compareTo(max) > 0) {
            max = y; //y is the largest
        }
        if (z.compareTo(max) > 0) {
            max = z; //z is the largest
        } else {
           max =x;
        }
        return max;
    }
	public static void main(String[] args) {
		System.out.println("Maximum number out of three integers is: " + maximum(15, 32, 45));
        System.out.println("Maximum number out of three float is: " + maximum(5.1F, 32.2F, 45.3F));
        System.out.println("Maximum among three string is: " + maximum("Apple", "Banana", "Peach"));
	}

}


