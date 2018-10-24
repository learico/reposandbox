package com.socgen.javabasics;

public class Main {
    public static void main(String[] args) {

	int ints[] = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);
//
	boolean booleans[] = new boolean[10];

	booleans[3] = true;
	System.out.println(booleans[3]);

	for (int i = 0; i < booleans.length; i++) {
	    System.out.println("index=" + i + "value=" + booleans[i]);
	}

    }

}
