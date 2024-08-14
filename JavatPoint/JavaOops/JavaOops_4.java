
// Object and Class Example --> 4

//  Reference variable -2 
//  We can also create multiple objects and store information in it through reference variable 

class Student4{
    int id;
    String name;
}


public class JavaOops_4 {
    public static void main(String[] args) {
        // Creating objects 
        Student4 s1= new Student4();
        Student4 s2= new Student4();

        // Initializing objects
        s1.id=101;
        s1.name="Suneo";
        s2.id=102;
        s2.name="Gian";
        // Printing data
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
        
    }
}
