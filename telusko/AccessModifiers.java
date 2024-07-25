
import other.*;

class D extends other.A{
    public void abc(){
        System.out.println(age);
        // protected will work also in the sub class in the another package
    }
    // also we cannot have the two public classes in the same file the idea is in one file we should have only one class
}
public class AccessModifiers {
    public static void main(String[] args) {
        A obj= new A();
        System.out.println(obj.marks);
        obj.show();
        AccessModiiers2 obj1= new AccessModiiers2();
        System.out.println(obj1.marks);
        System.out.println(obj1.car);

    }
}
