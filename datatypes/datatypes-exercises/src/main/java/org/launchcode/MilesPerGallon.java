package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        Double milesDriven = input.nextDouble();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("How much gas have you consumed?:");
        Double gasConsumed = inputTwo.nextDouble();
        Double mpg = milesDriven / gasConsumed;
        System.out.println("You are traveling at " + mpg +" mpg.");
    }
}
