
// Java This Keyword --> 9 
// this: to pass as argument in the constructor call 

// we can pass the this keyword in the constructor also . It is useful if we have to use one object in multiple classes

class JavaOops33B{
   JavaOops34A obj;
   JavaOops33B(JavaOops34A obj){
    this.obj=obj;

   }
   void display(){
    System.out.println(obj.data);
    //using data member of A4 class
   }
}

class JavaOops34A{
 int data=10;
 JavaOops34A(){
    JavaOops33B B= new JavaOops33B(this);
    B.display();
 }
}

public class JavaOops_33 {
    public static void main(String[] args) {
        JavaOops34A a = new JavaOops34A();
        
    }
}
