
// Java Vector Example



import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        // Create a Vector
         Vector<String> vec= new Vector<String>();
        //  Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        // Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+ vec);
        
    }
}
