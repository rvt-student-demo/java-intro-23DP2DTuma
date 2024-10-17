package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
        
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number == 0) {
        
        break;
        
        }
        
        numbers.add(number);
    }
        int total_sum = 0;
        for (int sum : numbers){
        total_sum += sum;
        }
        
        
        System.out.println(numbers.get(1) + numbers.get(2));
        System.out.println(total_sum);
        }
        
        }




    




