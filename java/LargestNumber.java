import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" is the largest");
        } else if( b>=a && b>=c){
            System.out.println(b+" is the largest");
        } else{
            System.out.println(c +"is the largest");
        }
        sc.close();
    }
    
}
