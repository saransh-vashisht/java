
// Java This Keyword --> 11

// Proving this keyword 
//  let's prove that this keyword refers to the current class instance variable. In this program , we are printing the reference variable and this , output of both variables are same 

class Oops_35{
    void m(){
        System.out.println(this); //prints same reference ID
    }
}


public class JavaOops_35 {
    public static void main(String[] args) {
        Oops_35 obj= new Oops_35();
        System.out.println(obj); //prints the reference ID
        obj.m();
    }

    /*
     * -> An instance of Oops_35 is created with new Oops_35 and the reference to this instance is stored in the variable obj
     * -> System.out.println(obj) --> prints the reference ID of the obj instance 
     * -> obj.m() --> calls the m() method on the obj instance which prints the reference ID of obj because this refers to the same instance
     * 
     */
}
