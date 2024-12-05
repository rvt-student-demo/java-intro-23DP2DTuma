package lv.rvt;
import java.util.*;
import java.io.*;
import java.nio.file.StandardOpenOption;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isProgramming = true;
        System.out.println("Welcome to person manager, type \"help\" to see available commands.");
        while (isProgramming) {
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Thanks, bye bye!");
                isProgramming = false;
            } else if (command.equals("Show")) { 

            }

        

        }
    }
}



    



