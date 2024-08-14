
// Aggregation in Java
/*
 * If a class have an entity reference it is known as Aggregation . 
 * Aggregation represents HAS-A relationship
 * Example-->
 * Employee object contains many information such as id,name,emailID etc. It contains one more object named address, which contains its own informations such as city ,state,country ,zipcode etc. as given below.
 * 
 */

//  class Employeee{
//     int id;
//     String name;
//     Address address; //Address is a class 

//  }

// In such case , Employee has an entity reference address , so relationship is Employee HAS-A address

// WHy use Aggregation ? --> For code reusability 

// Example of Aggregation

class Operation{
    int square(int n){
        return n*n;

    }
}

class Circle{
    Operation op; //aggregation
    double pi=3.14;

    double area(int radius){
        op= new Operation();
        int rsquare=op.square(radius); //code reusability i.e. delegates the method call
        return pi*rsquare;

    }
}

public class Inheritance_6 {
    public static void main(String[] args) {
        Circle c= new Circle();
        double result=c.area(5);
        System.out.println(result);

    }
}

// Agggregation is basically inheriting the class as the object and then we can use its methods 

// When use Aggregation?
// Code reuse is also best achieved by aggregation when there is no is-a relationship
// Inheritance should be used only if the relationship is-a maintained throughout the lifetime of object involved; otherwise
