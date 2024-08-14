
// Inheritance -5
/*
 * Why Multiple Inheritance is not supported in java?
 * To reduce the complexity and simplify the language , multiple inheritance is not supported in the java.
 * Consider a scenario where A,B and C are three classes . The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object , there will be ambiguity to call the method of A or B class. 
 * Since compile time errors are better than runtime errors , Java renders compile time error if you inherit 2 classes . So whether you have same method or different, there will be compile time error
 * 
 */

 class InheritanceA{
    void msg(){System.out.println("Hello");}

 }
 class InheritanceB{
    void msg(){System.out.println("Welcome");}

 }
 class InheritanceC extends InheritanceA,InheritanceB{ //suppose if it were
    

 }
public class Inheritance_5 {
    public static void main(String[] args) {
        InheritanceC obj = new InheritanceC();
        obj.msg(); //now which msg() method would be invoked 
        
    }
}
