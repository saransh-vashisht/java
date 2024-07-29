
class Oop{
    public void show1(){
        System.out.println("In Oop show");
    }
}

class oopsie extends Oop{
    public void show2(){
        System.out.println("In oopsie show");
    }
}





public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        double d=4.5;
        // int i =d;
        // dy default we can't convert the double or float value to the int value that we have there to be present
        // we can however use the typecasting to convert it to the integer format
        int i=(int) d;
        // removes the decimal and loosing the .5 values..

        Oop obj= new Oop();
        obj.show1();
        // obj.show2();
        // we are not able to call show2 method bcz it is not present in the parent class of Oop..

        // but we can have the refrence of Oop and the object of oopsie.. like in dynamic method dispatch

        Oop obj1= (Oop) new oopsie();
        obj1.show1();
        // upcasting
        // here we can typecast the object with the parent class like in the case of int and we have object of B and referring to the object of A 
        // even if we do not mention it will happen implicitly behind the scene and it will typecast upwards

        Oop obj2= new oopsie();
        obj2.show1();
        // obj2.show2();

        // even if the object is of oopsie we cannot use it bcz the refrence is of oop and it has no idea of what is show2..
        //the type of obj is A

        oopsie obj3= (oopsie) obj1;
        obj3.show2();
        // here we are doing the downcasting
        // even if the refrence is of oop  but whenever we assign we are downcasting it too oopsie i.e. child refrence










        System.out.println(i);

    }
}
