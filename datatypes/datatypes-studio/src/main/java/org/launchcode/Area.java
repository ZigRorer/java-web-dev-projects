package org.launchcode;
import java.util.Scanner;

public class Area { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the radius:");
    double rad = input.nextDouble();
    double area = Circle.getArea(rad);
    System.out.println("The area of the circle is" + area);
}
}
