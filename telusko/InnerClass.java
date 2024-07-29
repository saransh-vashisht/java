

class MilesMorales{
    int age;

    public void show(){
        System.out.println("In Miles Show");
    }

    static class Spiderman{
        public void config(){
            System.out.println("in config");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        MilesMorales obj= new MilesMorales();
        obj.show();

        // Spiderman obj1= new Spiderman();
        // so here the spiderman class is not openly available since it is the inner class of MilesMorales
        //to use it we should know miles first and then the spidy

        // MilesMorales.Spiderman obj2= new Spiderman();
        // now it will work to create the refrence but we cannot build the object
        // this inner class will have its own class but it will belong only to its parent class there
        // now to show the object being created we need the object of milex bcz without the miles we cannot have the spiderman

        // MilesMorales.Spiderman obj2= obj.new Spiderman();
        // obj2.config();

        //now to solve this issue we can make the spiderman static then we do not need the object of miles to be used

        MilesMorales.Spiderman obj3= new MilesMorales.Spiderman();
        obj3.config();
        // but miles cannot be static as he is the parent class which will require it to make changes in it


    }
}
