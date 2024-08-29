
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Java First Tasks by Jocund
        long startTime = System.currentTimeMillis();
        long startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Hello and welcome my friend !\n");

        //Uncomment task number to see the result to see the result

        //first();
        //second();
        //third();
        //fourth();
        //fifth();
        //sixth();
        seventh();
        //Calculation of an execution time and MemoryUsage
        long endTime = System.currentTimeMillis();
        long endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long executionTime = endTime - startTime;
        long memoryUsed = endMemory - startMemory;
        System.out.println("\n\nExecution time: " + executionTime + " milliseconds");
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("Memory used: " + memoryUsed/1024 + " Kbytes");
    }
    static void first() {
        for (int i = 1; i <= 20; i++) {
            System.out.print("___");
        }
        System.out.print("\n");
        System.out.println("| Mr.Jasurbek\t\t\t\t\t\t\t\t\t\t\t   |");
        System.out.println("| 25 Shakhrisabz street\t\t\t\t\t\t\t\t\t   |");
        System.out.println("| Tashkent city, 100000\t\t\t\t\t\t\t\t\t   |");
        System.out.println("| UZ \t\t\t\t\t\t\t\t\t\t\t\t\t   |");
        System.out.print("|");
        for (int i = 1; i <= 3; i++) {
            System.out.print("\t\t");
        }
        System.out.println("Mr. Mukhammadali Khayotov \t\t   |");
        System.out.print("|");
        for (int i = 1; i <= 3; i++) {
            System.out.print("\t\t");
        }
        System.out.println("209 Neungdong-ro, Seoul \t\t   |");
        System.out.print("|");
        for (int i = 1; i <= 3; i++) {
            System.out.print("\t\t");
        }
        System.out.println("Republic of Korea\t\t\t\t   |");

        for (int i = 1; i <= 20; i++) {
            System.out.print("___");
        }

    }
    static void second() {
        //Respond hello to the user who will write his/her name
        Scanner inp = new Scanner(System.in);
        System.out.println("Please write your name: ");
        String message = inp.next();
        System.out.println("Hello " + message + ". How are you?");
    }
    static void third() {
        //TIP Find the area and perimeter of a rectangle
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the  width of the rectangle: ");
        Double widthIn = input.nextDouble();
        System.out.print("Please enter the height of the rectangle: ");
        Double heightIn = input.nextDouble();
        //final double width = 4.5;
        //final double height = 7.9;
        double area = widthIn * heightIn;
        double perimeter = 2 * (area);
        System.out.println("Area of a rectangle is "+ area +
                "\nPerimeter of a rectangle is " + perimeter);
    }
    static void fourth() {
        //TIP Find the volume of a cylinder
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Please write a length of cylinder: ");
        double length = input.nextDouble();
        double area = Math.pow(radius,2) * Math.PI;
        double volume = area * length;
        System.out.printf("Area of a cylinder is %.2f " +
                "\nVolume of a cylinder is %.2f", area, volume);
    }
    static void fifth() {
        //TIP Find the volume of an equilateral triangle

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter length of the sides of equilateral triangle: ");
        double side = input.nextDouble();
        double area = Math.sqrt(3)/4 * Math.pow(side,2);
        double volume = area * side;
        System.out.printf("The area of the Equitlateral Triangle is %.2f \n The area of the Equitlateral Triangle is %.2f",area, volume);
    }
    static void sixth() {
        //TIP Find the Tax and Tip

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter cost of the a meal: ");

        double cost = input.nextDouble();
        double tax = cost * 0.15;
        double tip = cost * 0.18;
        double grand_total = cost+tax+tip;
        System.out.printf("The initial cost of meal amount is %.2f\n" +
                "The tax amount is %.2f\n The tip amount is %.2f\n " +
                "The grand total for the meal is %.2f",cost,tax,tip,grand_total);
    }
    static void seventh() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the distance to drive: ");
        double distance = input.nextDouble();
        System.out.print("Please enter the fuel efficiency of the car in mpg (miles per gallon): ");
        double fuel = input.nextDouble();
        System.out.print("Please enter the price per gallon: ");
        double price = input.nextDouble();
        double total_cost = distance/fuel*price;
        System.out.printf("The cost of driving is $%.2f", total_cost);
    }

}
