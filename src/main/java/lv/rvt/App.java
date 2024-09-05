package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadi savu vardu:");

        scanner.nextLine();

        String name = scanner.nextLine();
        int age = 17;
        boolean isOnline = false;

        System.out.println("Sveiks " + name);
        

    }

}
