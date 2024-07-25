package other;

class Launch{
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);
        System.out.println(obj.age);
        // protected works in the same package and it will give us the result
    }
}


public class A {
    protected int age=11;
    int marks=6;
    // if it is  not public we cannot access it outside it the package
    // if you want to make something to be accessed outside the package always make it public
    public void show(){
        System.out.println("results");


    }


}
