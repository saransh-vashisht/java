
class Heyo implements Runnable{
    // here we are implementing the runnable interface instead of the thread class and hence the Heyo class will be the runnable class
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Heyo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Senorita implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Senorita");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}



public class ThreadsRunnable {
    public static void main(String[] args) {
        // Heyo obj1= new Heyo();
        // Senorita obj2= new Senorita();
        // here we can create the runnable obj and use the refrence of our class
        Runnable obj1= new Heyo();
        Runnable obj2= new Senorita();

        // now if we want to shorten it we can use the lambda expression and the anonymous class






        // obj1.start();
        // obj2.start();

        // here the start method is not working bcz it is the part of the thread class and not of the runnable obj
        // so to do it we will use the runnable object and the constructor of the thread class to pass it the object and then we will use it to implement
        // we need to create the thread first

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();

    }
}
