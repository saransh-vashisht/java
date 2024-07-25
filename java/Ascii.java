import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char a= sc.next().charAt(0);
        sc.close();
        int c= a;
        System.out.println("ASCII value of "+ a+" is "+ c);
          // You can also cast char to int
         int castAscii = (int) a;
         System.out.println(castAscii);

    }
    
}
