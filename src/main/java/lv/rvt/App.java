package lv.rvt;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int ones = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());  
            if (number == 0) {
                System.out.println("Number of numbers:" + ones);
                System.out.println("Sum of numbers:" + sum);
                break;
            }
        
            else {
            ones = ones + 1;
            sum = sum + number;
            }
        }
        
    }

    

}

