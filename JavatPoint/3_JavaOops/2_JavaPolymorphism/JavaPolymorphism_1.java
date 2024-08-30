/**
 * 
 * Java Method Overloading 
 * If a class has multiple methods having same name but different in parameters it is known as Method Overloading 
 * It increases the code readability 
 * 
 * There are two ways to do the method overloading 
 *  1. By changing the number of arguments
 *  2. By changing the data type 
 * 
 * Method Overloading is not possible by changing the return type of the method only 
 * 
 * 
 * JavaPolymorphism_1
 */


//  Method Overloading : Changing no. of arguments

class Adder{
    static int add(int a ,int b){ return a+b;}
    static int add(int a,int b,int c){
     return a+b+c;
    }
}
public class JavaPolymorphism_1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11,11));
        
    }
    
}