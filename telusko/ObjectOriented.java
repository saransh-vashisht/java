
class Calculator{
    int a=9;
    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}


public class ObjectOriented {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        Calculator obj= new Calculator();
        int result= obj.add(num1,num2);
        System.out.println(result);
        // int result=num1+num2;
        // System.out.println(result);
    }
}

// Object Oriented Programming
// object- Properties and Behaviour
// Class-
// JVM creates the class file and also then the byte code
// 
