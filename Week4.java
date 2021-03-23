package oop;
import java.util.Scanner;

public class Week4 {

   public static void main(String[] args) 
   {
        String KOTA1, KOTA2;
        int ASCII1, ASCII2;
        Scanner input = new Scanner(System.in);
         
        System.out.println("Masukkan nama kota1 : ");
        KOTA1 = input.nextLine();
        ASCII1 = KOTA1.charAt(0);
        
        System.out.println("Masukkan nama kota2 : ");
        KOTA2 = input.nextLine();
        ASCII2 = KOTA2.charAt(0);
        
        if(ASCII1 < ASCII2)
        {
            System.out.println("Kota : ");
            System.out.println(KOTA1);
            System.out.println(KOTA2);
        }
        else
        {
            System.out.println("Kota : ");
            System.out.println(KOTA2);
            System.out.println(KOTA1);
        }
        
    }

}
