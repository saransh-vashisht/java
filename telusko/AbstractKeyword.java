
abstract class Car {
    // public void drive(){

    // }
    // so here we have built the car class but we do not know how to implement the
    // drive method but we can still access the method outside the class which will
    // basically do nothing so we should have some way to avoid it to be not
    // accessed but still be declared so that someone else can implement it later on
    // for us

    // here the car is an abstract feature bcz none buys car but we buy the car
    // model that we need

    public abstract void drive();

    public abstract void fly();
    // we can use the abstract feature of the drive which will help us in the
    // declaring the method only which can be used by someone else later on and can
    // be implemented

    // abstract method can only belong in the abstract class
    // and whichever class is extending the abstract class will have the abstract
    // method
    // and if we extend the abstract class we have to define the abstract class
    // compulsorily and over ride it
    // we cannot also create the object of the abstract class but can have the
    // refrence of it

    // abstract class can have the normal methods also and it will stil work

    //if we have class which cannot define all the abstract methods then that class will also become the abstract class

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car {
    // public void fly() {
    //     System.out.println("Flying");
    // }

    public void drive() {
        System.out.println("Driving");
    }
}

class UpdatedWagonR extends WagonR{ //concrete class
    public void fly(){
        System.out.println("Flying..");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // Car obj=new Car();
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
