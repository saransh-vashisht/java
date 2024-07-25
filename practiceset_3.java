//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

import java.util.Scanner;
public class practiceset_3 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Whats your name?");
     String name= sc.next();
    //    System.out.print("hello ");
    // System.out.print(name);
    // System.out.println(", have a good day");
    System.out.println("Hello " + name + " have a good day!");
    }
    
}
