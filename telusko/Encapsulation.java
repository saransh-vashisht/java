
class Human{
   private int age;
   private String name;
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
    // this keyword is the current object that is calling the method and it gives us the refrence to the actual value of the obj where it is stored and allow us to use our only one variable age which is both local and instance variable here without any confusion
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

// public int getAge(){
//     return age;
//    }
//    public void setAge(int a){
//     age=a;
//    }
//    public String getName(){
//     return name;
//    }
//    public void setName(String n){
//     name=n;
//    }

}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age=11;
        // obj.name="Naveen";
        obj.setAge(30);
        obj.setName("Naveen");
        System.out.println(obj.getName()+ " : "+ obj.getAge());
    }
}


// we use private keyword to ensure encapsulation 
// the variable with private keyword can be accesed only within the class
// we can access them indirectly through the methods which are get and set methods
// we can use any name for this methods
