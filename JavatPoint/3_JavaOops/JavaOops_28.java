
// Java This Keyword --> 4

// this :to invoke current class method 

// You may invoke the method of the current class by using the this keyword . If you don't use this keyword, compiler automatically adds this keyword . If you don't use the this keyword , compiler automatically adds this keyword while invoking the method 

class Oops_28{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
        // m(); //same as this.m()
        this.m();
    }
}

public class JavaOops_28 {
    public static void main(String[] args) {
        Oops_28 a= new Oops_28();
        a.n();
    }
}
