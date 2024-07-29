@Deprecated  // this can tells us that this class has been depricated and soon it will be removed from the code base or the java language so try to avoid it

class Naruto{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In Naruto show");
    }
}

class Sasuke extends Naruto{

    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In Sasuke show");
    }
    // through annotations we can tell the compiler our intentions which are used to help us with the code we are running like we have one letter mistake in above method but we are trying to override the method of a
    // @override is an example of the annotation and it helps us with using the annotation to give us the result that we need to have  and if our method that we are overriding is not right then we will have the error in it 
    // and here we are solving the problem at compile time through the compiler and is much better to solve it through this method we are using rather than run time or deployment error



}




public class Annotations {
    public static void main(String[] args) {
        // annotations are the supplement to the compiler or the runtime
        // they are the metadata
        // we supply extra information to the compiler or the runtime

        Sasuke obj = new Sasuke();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

// they are mainly used in the different java frameworks