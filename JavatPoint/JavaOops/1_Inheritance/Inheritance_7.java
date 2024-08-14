
// Aggregation in Java

// Understanding meaningful example of Aggregation

// Here the employee has an object of Address, address object contains its own information such as city,state,country etc. In such case relationship is Employee Has-A address.


// Also take reference of the Address.java file
 

public class Inheritance_7 {
    int id;
    String name;
    Address address;

    public Inheritance_7(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);

    }
    
    public static void main(String[] args) {
        
        Address address1= new Address("gzb", "UP", "india");
        Address address2= new Address("gnoida", "UP", "India");

        Inheritance_7 e= new Inheritance_7(111, "Sara", address1);
        Inheritance_7 e2= new Inheritance_7(112, "Ansh", address2);

        e.display();
        e2.display();

    


}
}
