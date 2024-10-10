package lv.rvt;

import java.util.*;

public class Stars {
    public static void printStars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
        
    
        }
    public static void printSquare(int size) {
        for(int i = 0; i < size; i++){
            printStars(size);
            System.out.print("\n");
        }
    }
    public static void printRectangle(int width, int height) {
        int number = 0;
        while (number < width && number < height) {

            printStars(width);
            System.out.print("\n");
            number++;

        }

    }
    public static void printTriangle(int size) {
        int number = 0;
        while (number <= size) {

            printStars(number);
            System.out.print("\n");
            number++;
        }

    }


    
}
