
class Hi extends Thread{
    public void run(){

        for (int i = 0; i < 100; i++) {
            
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };
}


class Heya extends Thread{ //now we have threads
    public void run(){

        for (int i = 0; i < 100; i++) {
            
            System.out.println("konichiwa");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };
}

public class Threads {
    public static void main(String[] args) {
        Hi obj1= new Hi();
        Heya obj2= new Heya();
        // from here we will execute the first line first and all the statement related to it and then it will execute the second statement
        // main will continue on the next statement only when the first statement is executed
        

        // now we want to execute the two show method at the same time  parallely
        // to do this we need to use the threads and to use that we just need to extend the classes of this objects to thread
        // obj1.show();
        // obj2.show();

        // instead of the show method to start the thread we should use the show method 
        // and it will create new thread for us and it will call the run method

        // then it will run parllely
        // but the iteration until 10 will not show it as it happens so fast it will be same as without threads
        

        // but if we run it until 100 it will show they are running parlelly
        // so we have scheduler
        // since we have multicore cpu so we can process multiple threads at the same time
        // obj1.start();
        // obj2.start();
        //now to print one statement and then other simultaneously then we cannot control the scheduler but we can suggest it on how to control it  through the priority
        // 
        System.out.println(obj1.getPriority());
        // 5 is the  default priority or normal
        // 1 is the least priority and 10 is the highest priority
        // by default every thread will have the normal priority
        
        // obj2.setPriority(Thread.MAX_PRIORITY);


        // even if we set the priority to the maximum we will just be suggesting it to the compiler to set it maximum but it will not be necessary be executed immediately by the threadscheduler
        // it will see if it has time for it it will do the priority but if it isn't it will use it's inherent algorithm

        // so since our compiler is so fast then we can make it work slower using the sleep method which will sleep the thread for sometime and make the other thread to be working for it 

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // above we are trying to optimize it further more to be used by us

        obj2.start();

        // even after putting the sleep statement we are not still getting the consecutive statement bcz of the scheduler

        //  And as an programmer we cannot have completely control the scheduler but we can optimize it maximum to get the best result that we want to have


         

    }
}
