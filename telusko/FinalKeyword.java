// final--> variable,method,class

final class Calcium{
    public final void show(){
        System.out.println("In Calcium Show");
        // it will stop the method overriding to avoid anyone else using your important methods
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalcium extends Calcium{
// so to avoid anyone inheriting your class then you can use the final keyword to make the someone else not use your features

}



public class FinalKeyword {
    public static void main(String[] args) {
        int num =8;
        num=9;
        System.out.println(num);
        // we can make our int const by using the final keyword which will not make it to change its value
        final int num1=8;
        // num1=10;
        // gives us the error then it cannot change
        System.out.println(num1);


        Calcium obj = new Calcium();
        obj.show();
        obj.add(4, 5);


    }
}
