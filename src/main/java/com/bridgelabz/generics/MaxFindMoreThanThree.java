package com.bridgelabz.generics;

import java.util.Arrays;

public class MaxFindMoreThanThree <T extends Comparable<T>> { //sorting using comparable interface in collection generic class
	private T[] inputArray;
	MaxFindMoreThanThree(T[] inputArray) { //Generic method to accept Type from generic class array
        this.inputArray = inputArray;  //converting into this method object
    }
    public MaxFindMoreThanThree() {
		// TODO Auto-generated constructor stub
	}
	public void maxElement() { //accept more than 3 no using array
        for (int i = 0; i < inputArray.length - 1; i++) { //index value of array
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public void display() {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
       Arrays.sort(inputArray);
        System.out.println("After Sorting");
        for(int i =0; i< inputArray.length ; i++){
            System.out.println(inputArray[i]);
        }
    }
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("Integers:-");
        new MaxFindMoreThanThree().display();
        System.out.println("String:-");
        new MaxFindMoreThanThree().display();
        System.out.println("Float:-");
        new MaxFindMoreThanThree().display();
        System.out.println("Maximum From Three Value");
        new MaxFindMoreThanThree().maxElement();
        new MaxFindMoreThanThree().maxElement();
        new MaxFindMoreThanThree().maxElement();
	}

}



