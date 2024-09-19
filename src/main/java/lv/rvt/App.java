package lv.rvt;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) {
    
    Scanner reader = new Scanner(System.in);
    
    int number = Integer.valueOf(reader.nextLine());
    
    if (number % 3 == 0) {
        System.out.println("Fizz");
    } else if (number % 5 == 0) {
        System.out.println("Buzz");
    } else if (number % 3 == 0 && number % 5 == 0) {
        System.out.println("FizzBuzz");
    } else {
        System.out.println(number);
    }

    
}

}