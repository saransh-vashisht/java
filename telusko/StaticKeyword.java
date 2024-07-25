
class Mobile{
    String brand;
    int price;
    static String name;
    // above variables are your instance variable
    //by using the static variable we can make all the obj common to all the object
    // static variables should be called with their class names and not with objects
    // static variable will be shared by all the objects so they will not be having the multiple static variable for every obj whereas we will have the same one common variable for all the objects. amd thus it will change for every object
    // in the non static methods we can use the static variable and there is no harm in doing so


    public void show(){
        System.out.println(brand+ " : " + price + " : "+ name);  
    }
}


public class StaticKeyword {
     public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price= 1500;
        // obj1.name = "SmartPhone";
        // so by making it static instead of using the obj1 we need to use class name i.e. mobile
        Mobile.name="SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price= 1700;
        // obj2.name = "SmartPhone";
        Mobile.name="Smartphone";

 
        Mobile.name="Phone";

        obj1.show();
        obj2.show();

     }
}
