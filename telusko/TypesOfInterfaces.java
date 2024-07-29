public class TypesOfInterfaces {
    public static void main(String[] args) {
        // there are three types of interfaces the first one is normal interface ,functional interface or SAM , marker interface
        //in interface we can only declare methods 
        // in future updates of java we also get the way for defining the methods in the interface
        // all the methods in interface are public abstract

        //  interface with two or more methods is the normal interface

        // SAM - single abstract method
        // functional interface
        // it has only one method

        // marker interface -> is a method which has no interface thus the blank interface
        // why we want blank interface?
        //  it is bcz is to update smth to the compiler
        // like to say to compiler to plz allow this
        // serialization- we can take the object and store the object into the hard drive
        // if we want to store the data we can use the concept of serialization from the ram or main memory
        // we can destroy it after saving
        // like when we are saving the game it will take more storage in the ram but less in the hardrive
        // when we restart the game we will get default values and we can load the current stats by saving it in harddrive
        //  deserialization -- is the way by which we can have the stored memory loaded into the main memory

        // to give the permission we can create the class and give the information with the help of the marker interface
        
    }

}
