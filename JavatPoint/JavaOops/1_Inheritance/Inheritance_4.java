
// Inheritance --> 4
// Hierarchial Inheritance
// When two or more classes inherits a single class, it is known as hierarchial inheritance .

class Animal3{
    void eat(){System.out.println("eating...");}

}
class Dog3 extends Animal3{
    void bark(){System.out.println("barking...");}

}
class Cat extends Animal3{
    void meow(){
        System.out.println("meowing...");

    }
}
public class Inheritance_4 {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.meow();
        c.eat();
        // c.bark() //CT Error 
         

    }
}
