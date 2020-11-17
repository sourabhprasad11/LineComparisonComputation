package com.LineCalculation;

import java.util.Scanner;

public class App 
{
	public int CalculateLength(int x1, int x2, int y1, int y2) 
	{
		double length_value=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		int length=(int) Math.sqrt(length_value);
		System.out.println( "Length of the Line: "+length );
		return length;
	}
	
	public int getInput_x1() {
		Scanner input= new Scanner(System.in);
    	System.out.println( "Input the values for x1: ");
    	int x1= input.nextInt();
    	return x1;
	}
	public int getInput_x2() {
		Scanner input= new Scanner(System.in);
    	System.out.println( "Input the values for x2: ");
    	int x2= input.nextInt();
    	return x2;
	}
	public int getInput_y1() {
		Scanner input= new Scanner(System.in);
    	System.out.println( "Input the values for y1: ");
    	int y1= input.nextInt();
    	return y1;
	}
	public int getInput_y2() {
		Scanner input= new Scanner(System.in);
    	System.out.println( "Input the values for y2: ");
    	int y2= input.nextInt();
    	return y2;
	}
	public void checkEquality(double l1, double l2) {
		if(l1==l2) {
    		System.out.println( "Length of line 1 is equals Length of line 2" );
    	}
    	else
    		System.out.println( "Line 1 is not equals to Line 2" );
    	 
	}
    public static void main( String[] args )
    {
    	App app_object= new App();
    	System.out.println( "Welcome to the Line Comparison Computation" );
    	
    	int x1=app_object.getInput_x1();
    	int x2=app_object.getInput_x2();
    	int y1=app_object.getInput_y1();
    	int y2=app_object.getInput_y2();
    	double length1=(double) app_object.CalculateLength(x1,x2,y1,y2);
    	
    	int x11=app_object.getInput_x1();
    	int x21=app_object.getInput_x2();
    	int y21=app_object.getInput_y1();
    	int y22=app_object.getInput_y2();
    	double length2=(double) app_object.CalculateLength(x11,x21,y21,y22);
    	
    	app_object.checkEquality(length1,length2);
    	
    }
}
