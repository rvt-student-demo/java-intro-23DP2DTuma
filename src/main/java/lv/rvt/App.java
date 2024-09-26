package lv.rvt;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int fact = 1;
        System.out.println("Give a number: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        for (i = 2; i <= number2; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }

        
        
        
}
        
    

    



