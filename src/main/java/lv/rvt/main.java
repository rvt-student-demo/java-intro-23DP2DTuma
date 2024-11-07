package lv.rvt;

import java.util.*;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    
        
        System.out.println("Enter numbers:");

        Statistics statistics2 = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            statistics2.addNumber(input);
            
            if (input % 2 == 0) {
                even.addNumber(input);
            }
            else {
                odd.addNumber(input);
            }
        }
        System.out.println("Sum: " + statistics2.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}


