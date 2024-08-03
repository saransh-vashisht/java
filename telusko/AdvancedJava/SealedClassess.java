package AdvancedJava;

sealed class mars permits phobos,deimos,Europa{
// we can allow o class to be permitted by the sealed class to be inherited 
// but we neeed the inherited class to be sealed , non-sealed or final to be inherited 
// if we make a permit we need to have to extending them surely 

// now if d try to extend we will get the error 


// we can extend any other class and also implements any other interface and also can permits in the sealed and it should be the las t thing to be used 




}


sealed class   phobos extends mars permits titan {
// to make them further inherited we need to be sealed and then permitting them ahead
// it will make the class to be inherited further on 

}


non-sealed class Europa extends mars{
    // now if we want to inherit the sealed class and then it to be inherited by anyone we can have the non-sealed class
}

final class deimos extends mars{

}

// we want the class phobos and deimos both to inherit the mars class but titan do not inherit it 
// amd give us the error if we try to inherit
// final will give us error if we make mars final 
// we can do it by using the sealed class




 final class titan extends phobos{

}


sealed interface ganymade permits callisto{

}

non-sealed interface callisto extends ganymade{
  // when inheriting the interface we need the child to be sealed or non sealed

}




public class SealedClassess {
    public static void main(String[] args) {

        // we can make the proper model of the application using all the oops methods and all the base classes to make it work properly

        // 


        // Abstract class  
        // we create a base class which might have some abstract methods and also some defined methods and actual implementation which will be done by the concrete classes

        // abstract class is meant to be inherited 

        // 
        
        // Final Class -- final implementation of the classes and we cannot inherit them 

        // we want inheritance but not every class can do it but we want to be a limited class which we want it to be inherited 


        // Sealed classes --
        // sealed keyword is used to inherit from the particular classes and the particular interface

    }
}
