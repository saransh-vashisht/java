
class Calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        Calculator obj= new Calculator();
        int result= obj.add(num1,num2);
        System.out.println(result);
    }
}
