package lv.rvt;

import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int sum = 0;
        
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:");

        while (true) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Right! \n" + "you have won the game.");
                break;
            } 
            else {
                System.out.println("wrong");
                sum += 1;
            }
            
            if (sum == 3){
            
            System.out.println("The correct number was " + numberToGuess);
            System.out.println("You have lost the game. ");
            }

    }

}

}

    




