
class Counter{
    int count;
    public  synchronized void increment(){
        // synchronized keyword will execute only one thread first and then the second one when the first one has finished its execution
        
        count++;
    }
}


public class ThreaddSafe {
    public static void main(String[] args) {
        
        Counter c = new Counter();

        Runnable obj1=()->{
            for (int i = 0; i < 10000; i++) {
               c.increment();
            }

        };

        Runnable obj2=() ->{
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);


        t1.start();
        t2.start();

        
        try {
            t1.join();
            t2.join();
            // it allows the join method to the main method for the threads to complete the method and then execute the results

            // Still even after join we are getting the value not of 2000 but different values which makes the thread unpredictable

        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }

        System.out.println(c.count);
    }
}
