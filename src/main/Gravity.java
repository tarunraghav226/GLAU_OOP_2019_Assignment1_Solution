/*
 * @problemAuthor Mr. Divyansh Bhardwaj
 * @solutionAuthor Tarun (sec A 2nd year)
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	double GRAVITY_CONSTANT=9.8;
	double speed=0.0;
	double distance=0.0;
	double time=0.0;

	void calculateSpeed(){
			speed = GRAVITY_CONSTANT * time;
	}

	void calculateDistance(){
			distance = 0.5*(GRAVITY_CONSTANT * time * time);
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Gravity obj = new Gravity();
		obj.time = scan.nextDouble();
		obj.calculateSpeed();
		obj.calculateDistance();
		System.out.println("The speed of the object at "+obj.time+" seconds after its release is "+obj.speed+" and the distance the object has travelled in the "+obj.time+" seconds after the relase is "+obj.distance);
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
