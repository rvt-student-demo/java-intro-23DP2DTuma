package lv.rvt;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int ones = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        System.out.println("Give a number:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());  
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum:" + sum);
                System.out.println("Numbers: " + ones);
                System.out.println("Average: " + (double)sum / ones);
                System.out.println("Even: " + evenNumbers);
                System.out.println("Odd: " + oddNumbers);
                break;
            }
            
            if (number % 2 == 0) {
                evenNumbers++;
                continue;
            }

            if (number % 2 != 0) {
                oddNumbers++;
                continue;
            }

            

            else {
                sum += number;
                ones += 1;
            
        }
        
        






    }



}
    
}


