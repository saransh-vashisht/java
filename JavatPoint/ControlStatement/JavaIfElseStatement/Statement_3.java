// Leap Year Example for the if else statement


public class Statement_3 {
    public static void main(String[] args) {
        int year=2001;
        if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
            System.out.println("Leap Year");

        }else{
            System.out.println("Common Year");

        }
    }
}

