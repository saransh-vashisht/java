
// abstract class penniParker{
//     public abstract void show();
//     public abstract void config();
// }

interface penniParker{

        int age=44;
        String area="Mumbai";
        // we can have the variables in the interface but by default they have to be final and static


     void show();
     void config();
}
// we can also use the interface instead of the abstract 
// we also have no need to say method as public abstract bcz by default they are public abstract
interface japaneseSpidey{
    void run();
}

interface kido extends japaneseSpidey{

}

// we create the interfaces so that we can design something - it gives us the methods we need 
// class spiderSuit implements penniParker,japaneseSpidey{
//     public void show(){
//         System.out.println("in show");
//     }
//     public void config(){
//         System.out.println("in config");
//     }
//     public void run(){
//         System.out.println("running...");
//     }


// }
// when we implement interface it becomes compulsory to implement both the methods that are present . 
// we also need to have both the methods to be implemented but if we dont implement it will become the abstract class

class spiderSuit implements penniParker,kido{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running...");
    }

    // so when we extend the interface to another interface and implement it in a class we have to use the methods of that parent interface also to be used to be working about it ...
    // to see try commenting the above method

}




public class MoreInterfaces {
    public static void main(String[] args) {
        penniParker obj;
        obj= new spiderSuit();
        obj.show();
        obj.config();
        // by using the interfaces we can instantiate the interface as the object but we cannot create the object 
        // so to solve this we cannot create the object of A but we can create the object of B 

        System.out.println(penniParker.area);
        // since the variable are static and fixed in the interface we can directly use them in our main class
        // we cannot change their values either

        // so here we cannot implement the run method bcz the penniparker only knows the two methods show and config so to make it work we have to create the new refrence of spidysuit to make the run method work
        japaneseSpidey obj1= new spiderSuit();
        obj1.run();

        spiderSuit obj3= new spiderSuit();
        obj3.config();
        obj3.run();
        obj3.show();

    }
}

// we get the only the methods of the class from the interface and not the variables
// interface don't have their own memory in the heap

// in the interfaces we can have more than one class implementing the multiple interfaces
// but in abstract classes we cannot have the multiple interface to be present


// class-class -> extends
// class-interface -> implements
// interface-interface->implements