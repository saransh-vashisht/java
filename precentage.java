import java.util.Scanner;



public class precentage {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        sub1=s.nextInt();
        sub2=s.nextInt();
        sub3=s.nextInt();
        sub4=s.nextInt();
        sub5=s.nextInt();
        int percentage =(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.print("the precebtage of the student is:");
        System.out.println(percentage);
        ;


    }
    
}
