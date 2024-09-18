package lv.rvt;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) {
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Grade points [0-100]:");
    int number = Integer.valueOf(reader.nextLine());

    if (number < 0) {
        System.out.println("Grade: Impossible!");
    } else if (number <= 49) {
        System.out.println("Grade: failed");
    } else if (number <= 59) {
        System.out.println("Grade: 1");
    } else if (number <= 69) {
        System.out.println("Grade: 2");
    } else if (number <= 79) {
        System.out.println("Grade: 3");
    } else if (number <= 89) {
        System.out.println("Grade: 4");
    } else if (number <= 100) {
        System.out.println("Grade: 5");
    } else {
        System.out.println("Grade: Incresible!");
    }

    
}

}