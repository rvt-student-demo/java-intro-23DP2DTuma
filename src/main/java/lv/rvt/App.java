package lv.rvt;

import java.util.*;

public class App 
{

    public static void main( String[] args ) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + (double) (first / second));

        System.out.println("Uzraksti savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Uzraksti savu Uzvārdu: ");
        String username = scanner.nextLine();
      
        System.out.println("Uzraksti savu grupu: ");
        String group = scanner.nextLine();

        System.out.println(name + " " + username + " " + group + " ");
    }
}