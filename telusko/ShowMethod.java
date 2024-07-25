
class C{

    public C(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in C show");
    }
}


public class ShowMethod {
    public static void main(String[] args) {

        // int marks;
        // marks=99;

        // A obj = new A();
        //A obj;
        //obj= new A(); //this is where you create the new object
        // but we are not creating any variable to be stored in the stack like in the case of the marks 
        // so whenever we use new A(); an object is created which is known as the anonymous object 
        // we can't reuse these objects and can't use this again


        // obj.show();
        // obj.show();
        //it willl give error bcz we are repeating the object

        new C().show();
        new C().show();
    }

    // behind the scenes of calling the show method
    // here the obj is not the object but is the reference variable pointing to the object
}
