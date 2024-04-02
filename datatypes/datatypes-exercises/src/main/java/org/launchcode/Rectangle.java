package org.launchcode;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        int length = input.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        int width = inputTwo.nextInt();
        int area = length * width;
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " +area);
    }
}
