import java.util.Scanner;


public class Swap {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int a= sc.nextInt();
         int b= sc.nextInt();
         int temp;
         sc.close();
        System.out.println("numbers before swapping: "+ a +" "+ b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("numbers after swapping: "+ a +" "+ b);
    }
    
}
