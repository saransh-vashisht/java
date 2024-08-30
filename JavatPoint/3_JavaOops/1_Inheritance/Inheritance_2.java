
// Inheritance --> 2
// Type of Inheritance in Java
// Single,Multilevel and Hierarchial --> though classes
// multiple and hybrid inheritance is supported through interface only
// When one class inherits multiple classes it is known as the multiple inheritance 

// Single Inheritance Example 
// when a class inherits another class it is known as a single inheritance

class Animal{
    void eat(){System.out.println("Eating...");}

}

class Dog extends Animal{
    void bark(){System.out.println("Barking...");}

}

public class Inheritance_2 {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();
        d.eat();

    }
}
