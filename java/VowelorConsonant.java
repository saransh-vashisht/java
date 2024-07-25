import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='a'|| a =='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E'||a=='I'||a=='O'|| a=='U'  ){
       System.out.println("character "+ a +" is an vowel");

        }
         else{
            System.out.println("character "+ a +" is not an vowel");

         }
      sc.close();
    }
    
}
