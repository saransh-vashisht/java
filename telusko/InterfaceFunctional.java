

@FunctionalInterface //here we have used the annotation functional interface and it helps us in specifying that the functional interface is ensured in our code with only one method
interface Thors{ //SAM interface- Single Abstract Method Interface or the functional interface
    void show();
    // void run(); 
    //if we use it we will get the error bcz of annotation
    
}

// class Ylva implements Thors{
//     public void show(){
//         System.out.println(" In the Ylva Show");
//     }
// }

// one way of implementing method is using the another method 
//  another one is using the anonymous inner class like shown in below




public class InterfaceFunctional {
    public static void main(String[] args) {
        Thors obj = new Thors() {
            public void show(){
                System.out.println("In Thors Show");
            }
        };
        // second way to solve it by using the anonymous inner class
        
        obj.show();
        }
        
    }


    // in Java 8 we got new feature known as the lambda expressions which made it easier to solve the above way and it can only be used in the functional interface


