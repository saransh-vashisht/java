class Mobile2{
    String brand;
    int price;
    static String name;

    public Mobile2(){
        brand="";
        price=200;
        System.out.println("in constructor");
        
    }
    // we can use the constructor to have our objects have some pre defined values to be used by it.
    // but here we are using name which is static variable which is getting initialized everytime and we do not want to do that 
    // to avoid that we can use the static block and it will be called anytime especially when so many static blocks are used . 

    static{ 
        name="Phone";
        System.out.println("in static ");
    }
    // static method will always be called first
    // firstly the class loads and then the objects are instantiated
    // in jvm there is special place called the class loader which will load the class from our library which will be used to load the class and it will happen only once

    // if we do not create the obj it will not load the class 






    public void show(){
        System.out.println(brand+ " : " + price + " : "+ name);
    }
}



public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
        // class class method here will use the forname to call our class without even calling it  however it throws an exception here 
        // it will use the system class loader to load the class
        //normally we don't use it unless its used by the jdbc
        


        Mobile2 obj1= new Mobile2();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile2.name="Smartphone";

        Mobile2 obj2= new Mobile2();
    }
}
