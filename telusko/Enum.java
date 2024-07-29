
enum Status{
    Running,Failed,Pending,Success;
}
// enum is used for defining the named constants 
// here the client can have any status like running , failed etc


public class Enum {
    public static void main(String[] args) {
        int i=5;
        Status s=Status.Running;
        System.out.println(s);
        // we can use the enum as the datatype and rest all are objects and status is class

        // when we run we can have the constant we have set to it

        System.out.println(s.ordinal());
        // ordinal gives us the index of our named constant that we have selected to be running

        Status[] r= Status.values();
        // status.values give us an array of the status all the named constants
        // enum got some methods that are needed to be used here 

        for (Status z : r) {
            System.out.println(z+" : "+ z.ordinal());
        }



    }
}
