
// class Heyo implements Runnable{
//     // here we are implementing the runnable interface instead of the thread class and hence the Heyo class will be the runnable class
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println("Heyo");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Senorita implements Runnable{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println("Senorita");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         } 
//     }
// }

public class ThreadsRunnableLambda {
    public static void main(String[] args) {
    //     Runnable obj1= new Runnable(){
    //         public void run(){
    //                     for(int i=1;i<=5;i++){
    //                         System.out.println("Heyo");
    //                         try {
    //                             Thread.sleep(10);
    //                         } catch (InterruptedException e) {
    //                             e.printStackTrace();
    //                         }
    //                     }
    //     }
    // };
    // here we have used the anonymous class to implement the runnable interface

    // updated version of it in lambda expression

    Runnable obj1=() ->{
        for (int i = 0; i <= 5; i++) {
            System.out.println("hi");
        }
        try{Thread.sleep(11);}catch(InterruptedException e){e.printStackTrace();}
    };

    Runnable obj2=() ->{
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello");
        }
        try{Thread.sleep(15);}catch(InterruptedException e){e.printStackTrace();}
    };

    Thread t1= new Thread(obj1);
    Thread t2= new Thread(obj2);

    t1.start();
    t2.start();
    


}
}
