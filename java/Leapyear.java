import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        Boolean leap=true;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                leap=true;
                else
                leap=false;

            }
            else
            leap=true;
        }  
        else
        leap=true;


        if(leap){
            System.out.println("THis is a leap year");
        }
        else{
            System.out.println("this is not  a leap year");
        }
        scanner.close();
    }
    
}
