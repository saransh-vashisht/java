
class Mobile3{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+ " : " + price + " : "+ name);  
    }
    // above is an instance method. 
    // below will be the static method

    public static void show1(Mobile3 obj){
        System.out.println(obj.brand+ " : " + obj.price + " : "+ name);
    }
    // we can call the static method directly with the help of class name
    // we can use a static variable with static method but we cannot use the instance variable with the static method...
    // but however we can use  it through indirectly by the object refrence.



}


public class StaticMethod {
    public static void main(String[] args) {
        // here we use static bcz if we dont use it and call the main method then it will need the object of the class but by using static we do not need it and it will directly initialize it .
        Mobile3 obj1 = new Mobile3();
        obj1.brand = "Apple";
        obj1.price= 1500;
        // obj1.name = "SmartPhone";
        // so by making it static instead of using the obj1 we need to use class name i.e. mobile
        Mobile3.name="SmartPhone";

        Mobile3 obj2 = new Mobile3();
        obj2.brand = "Samsung";
        obj2.price= 1700;
        // obj2.name = "SmartPhone";
        Mobile3.name="Smartphone";

 
        Mobile3.name="Phone";

        obj1.show();
        obj2.show(); 

        Mobile3.show1(obj1);

    }
}
