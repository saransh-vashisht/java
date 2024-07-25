//Write a Java program to convert Kilometers to miles.

import java.util.Scanner;

public class practiceset_4 {
    public static void main(String[]args){
        float kilometre;
   Scanner s= new Scanner(System.in);
   kilometre= s.nextFloat();
   float miles = (float) (kilometre/1.609);
   System.out.println(miles);
   
    }
    
}
