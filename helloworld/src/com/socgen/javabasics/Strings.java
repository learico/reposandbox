package com.socgen.javabasics;

public class Strings {

    public static void main(String[] args) {

	String foo = null;

	System.out.println(foo.length());

	String hello = " Hello world Warcraft!";
	System.out.println(hello);
	System.out.println(hello.toUpperCase());
	System.out.println(hello.toLowerCase());

	System.out.println(hello + ", length=" + hello.length());

    }
}
