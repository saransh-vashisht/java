
// class var{

// }
// it will give us error as the var keyword cannot be used as the classname






public class LocalVariableTypeInferencee {

    // var num =10;
    // if we initialize var as the instance variable then it will also gives us the error in the code 

    public static void main(String[] args) {
        int a =9;
        var b=8;

        // Local Variable Type Inference --> it helps us in the local variables that we can initiate them without using the type keyword and instead we can use the var keyword to start with them to give the result that we need 
        //  it does not specify the datatype

        // var will assign the datatype at the compile time and doing it behind the scene and thats why java is still a statically typed integer

        int c;
        // we can have datatype and not give value to it 


        // var d;
        // we cannot have the var keyword without the initializer bcz then the compiler cannot give the datatype to this variable

        var d=10;

        String var="Saransh";
        // we can have the var as our variable name and as a keyword
        // but it will give us error if we have the classname as the error

        int nums[]= new int[10];
        var nums1= new int[10];

        // we can create the array with var and we just need to specify the datattype on RHS ad the size of array using the square brackey

        //  
        Alien obj1Alien = new Alien();

        var obj= new Alien();

        //  we can also have the object type of the class also as the var 
        




    }
}
