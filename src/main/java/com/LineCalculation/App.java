package com.LineCalculation;

import java.util.Scanner;

public class App 
{
	public void CalculateLength(int x1, int x2, int y1, int y2) 
	{
		double length_value=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		double length= Math.sqrt(length_value);
		System.out.println( "Length of the Line: "+length );
	}
    public static void main( String[] args )
    {
    	App app_object= new App();
    	System.out.println( "Welcome to the Line Comparison Computation" );
    	Scanner input= new Scanner(System.in);
    	System.out.println( "Input the values for x1: ");
    	int x1= input.nextInt();
    	System.out.println( "Input the values for x2: ");
    	int x2= input.nextInt();
    	System.out.println( "Input the values for y1: ");
    	int y1= input.nextInt();
    	System.out.println( "Input the values for y2");
    	int y2= input.nextInt();
    	app_object.CalculateLength(x1,x2,y1,y2);
    }
}
