
// Inheritance --> 3
// Multilevel Inheritance Example 
//  When there is a chain of inheritance , it is also known as multilevel inheritance 

class Animal1{
    void eat(){System.out.println("eating...");}

}

class Dog1 extends Animal1{
    void bark(){System.out.println("barking...");}

}
class BabyDog extends Dog1{
    void weep(){System.out.println("weeping...");}
}


public class Inheritance_3 {
    public static void main(String[] args) {
        BabyDog d= new BabyDog();
        d.weep();
        d.bark();
        d.eat();
        
    }
}
