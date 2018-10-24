package com.socgen.javabasics;

public class Calculator {

    /*
     * this variable provides.
     */
    private double a;
    private double b;

    /*
     * this constructor provides.
     */

    public Calculator(double a, double b) {
	this.a = a;
	this.b = b;
    }

    /*
     * this method provides.
     */

    public double add() {

	return a + b;
    }

    /*
     * 
     */

    public double substract() {

	return a - b;

    }

    public double multiply() {
	return a * b;

    }

    public double divide() {
	return a / b;

    }
}
