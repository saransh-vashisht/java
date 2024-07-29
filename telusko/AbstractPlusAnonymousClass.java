
abstract class peterParker{
    abstract public void show();
}
// abstract method is used to show the abstract result that we have to be used
//using both the abstract class and anonymous inner class both 

// class maryJane extends peterParker{

//     public void show() {
//         System.out.println("In Mary Jane Show");
//     }

// }
// we have implemented this class only to work once for the show method thus we can exhibit the results
// we can avoid using the new class by using the anonymous inner class





public class AbstractPlusAnonymousClass {
    public static void main(String[] args) {
        
        peterParker obj= new peterParker() {
            public void show(){
                System.out.println("In Mary Jane show");
            }
        };
        obj.show();
     // so here we have implemented the abstract class method without creating a new class specially for it using the anonymous inner class  
    }
}
