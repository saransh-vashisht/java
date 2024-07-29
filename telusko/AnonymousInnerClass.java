import other.A;

class Gwanda{
    public void show(){
        System.out.println("In Gwanda Show");
    }
}
// to change the behaviour of show we can do the method overriding by extending a new class and using its improved method and using its object but refrence of gwanda
// but if we want to use the class only once why create a new class ??


public class AnonymousInnerClass {
    public static void main(String[] args) {
        Gwanda obj = new Gwanda(){
            public void show(){
                System.out.println("In Gwen Show"); //different implementation of show method
            }
        };

        //here we have created a new anonymous inner class which will help us changing the method of prev class w/o creating a new class for this to work
        // this class will have its separate class file to be used by it 
        
        obj.show();
    }
}
