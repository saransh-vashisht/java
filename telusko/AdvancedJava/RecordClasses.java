package AdvancedJava;

class Alien{
    // variables which will hold the data are known as the states
   private int id;
   private String name;
//    private bcz of encapsulation and finaal bcz we are not going to change them 
public Alien(int id, String name) {
    this.id = id;
    this.name = name;
}
public int getId() {
    return id;
}
public String getName() {
    return name;
}
@Override
public String toString() {
    return "Alien [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Alien other = (Alien) obj;
    if (id != other.id)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    return true;
}



// for holding only the two data we need to have so many methods which is too long and tiring in java







}


record Alien1(int id,String name){ }
// it will have all the above 40 lines 
// here we have state variables  and all the methods that we need to be defined 

// if we want a default constructor we can explicitly define it 
// and need to call the parametrized consturctor 
// all the records are final and we cannot change it 
// therefore it doesnot have the set method


// we can change the behaviour of the constructor and can also use the default constructor 

record Alien2(int id ,String name){

    // we can have the default constructor

    public Alien2(){
        // to make it work we need to call the main constructor by passing some default values
        this(0, " ");
        // although its not recommended bcz
        //  it will have fixed default values
        // also all the variables in the record are final which means we cannot change thm and  no set method

        

    }

    public Alien2(int id,String name){
        this.id= id;
        this.name= name;
    }
}


// why we need to create the constructor now ?
// if we want to give some pre defined pre checks 

record Alien3(int id,String name){

    public Alien3(int id,String name){
        if (id==0) {
            throw new IllegalArgumentException("id cannot be zero");
        }
        this.id=id;
        this.name=name;
        // this is a canonical constructor bcz it has the same structure as defined in the state descriptor



    }

 }


//  we can shorten it by using the compact canonical structure
// here we have no need to mention the states and also the this methods it will do them behind the scenes 
// we will only need to do the checks that we need to be doing

record Alien4(int id,String name){

    static int nums;
    // int age;
    //  instance variable will give us an error

  
    public Alien4{
        if (id==0) {
            throw new IllegalArgumentException("Id cannot be zero");
        }
    }

    public void show(){

    }
}

// things to remember 
// all the variables here are private and final 
// record is actually a class and this cannot extend any other class 
// the record class extends only an another record class
// we can implement as many interfaces as we want 
// we can also create the multiple methods 
// we can create normal methods, static methods and the static variable as well 
// we need to define instance variable only inside the brackets and not inside the class
// if we want the value we can use variable name as .variablename and not as get method


  



public class RecordClasses {
    public static void main(String[] args) {
        // data carrier classes are very verbose
        //  they are only used for data storage and data carrying purpose

        // In java projects there will be two types of classes one will be functional and the other will be data carrier class 

        // the functional class will do processing work and they will be service & utility classes 


        // some classes are only used for the data carrying purposes 

        //  

        Alien a1= new Alien(1, "Saransh");

        Alien a2= new Alien(1, "Saransh");


        System.out.println(a1);

        


        // only get the name 
        // but to get the entire object we need the toString method



        // now if we want to compare the two strings having the same data but different object we need to inherit the equals method and modify it to show only the equals value and not see it according to the object refrence 

        System.out.println(a1.equals(a2));


        Alien1 a11= new Alien1(1, "saransh");

        Alien1 a21= new Alien1(1, "saransh");

        System.out.println(a11);

        System.out.println(a11.equals(a21));


        Alien1 a3= new Alien1(2, "saransh");

        Alien4 a4= new Alien4(0,"Saransh");





    }
}
