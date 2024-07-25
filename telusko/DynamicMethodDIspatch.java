
class Computer{

}

class Laptop extends Computer{

}



class Ad{
    public void show(){
        System.out.println("in A Show");
    }
}

class Bv extends Ad{
    public void show(){
        System.out.println("In B Show");
    }
}

class Cc extends Ad{
    public void show(){
        System.out.println("In C Show");
    }

}


public class DynamicMethodDIspatch {
    public static void main(String[] args) {
        Ad obj= new Ad();
        obj.show();

        // here the obj type is A  but the implementation is B
        obj=new Bv();
        // we can assign new obj to the old variable
        obj.show();
        // so here the object is pointing to the b obj instead of the a object.
        obj=new Cc();
        obj.show();
        // this is working bcz we are using the inheritance the child objects of the parent i.e. A 

        Computer obj1= new Laptop();
        // here we are reffering the laptop object as the computer

    }
}
