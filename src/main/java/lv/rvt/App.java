package lv.rvt;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) {
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Value of the gift?");
    int Itemprice = Integer.valueOf(reader.nextLine());
    
    if (Itemprice >= 5000 && Itemprice < 25000) {
        System.out.println("Tax: " + (100+ (Itemprice - 5000) * 0.08));
    } else if (Itemprice < 5000) {
        System.out.println("No Tax!");
    } else if (Itemprice >= 25000 && Itemprice < 55000) {
        System.out.println("Tax: " + (1700+ (Itemprice - 25000) * 0.10));
    } else if (Itemprice >= 55000 && Itemprice < 200000) {
        System.out.println("Tax: " + (4700+ (Itemprice - 55000) * 0.12));
    } else if (Itemprice >= 200000 && Itemprice < 1000000) {
        System.out.println("Tax: " + (22100+ (Itemprice - 200000) * 0.15));
    } else if (Itemprice >= 1000000) {
        System.out.println("Tax: " + (142100+ (Itemprice - 1000000) * 0.17));
    }




}

}