package lv.rvt;



import java.util.Scanner;

public class App 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uzraksti savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Uzraksti savu Uzvārdu: ");
        String username = scanner.nextLine();
      
        System.out.println("Uzraksti savu grupu: ");
        String group = scanner.nextLine();

        System.out.println(name + " " + username + " " + group + " ");
    }
}