
// abstract class Compputer{
//     public abstract void code();
// }

interface Compputer{
    void code();
}
// we generalize it into the abstract class bcz the code is doing nothing here
// now instead of using the abstract class we can use the interface which can helps us in minimizing the code and not writing abstract and we need to use implements instead of the extends


class Lappy implements Compputer {
    public void code(){
        System.out.println("code,compile,run");
    }

}

class Desktop implements Compputer{
    public void code(){
        System.out.println("code,compile,run: Faster");

    }
}

class Developer{
    public void devApp(Compputer lap){
       lap.code();
    }

}
//so here we have as an developer was hired and needed laptop to code on it so the company gave us the laptop object lap which we will use in our devApp method to call the code method in the lappy to build the account


public class InterfaceNeed {
    public static void main(String[] args) {
        Compputer lap= new Lappy();
        Compputer desk= new Desktop();
        Developer naveen = new Developer();
        // here we are getting the interfrace refrences
        naveen.devApp(desk);
        // so here if we have the desktop then it won't devlop the application bcz the application method in devloper is made for the laptop object but not for the computer object
        // design is done to make the application more flexible
        // so here the developer is dependent on a computer so in this example we can have the same computer class for all
        // we make an application which is loosely coupled

         
    }
}
