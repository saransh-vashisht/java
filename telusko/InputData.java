import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//bufferedreader and io exception both belongs to the io package
import java.util.Scanner;

// most of the classes we have use the java.lang which is automatically imported but if we want to import something which do not belong to it we have to explicitly mention it 

//

public class InputData {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        // to print smth on console we use the above statement
        //println is a method of PrintStream class 
        // we create the object of PrintStream class to use the println method which is out object which is present in the system class and it is static 
        // since it is static we can use it with the help of System.out and then we can get the println();

        //now how to get the input in java
        //so we have the in object in the system class for the input and the read method 
        // this way throws the IO exception which we need to handle it using the try - catch statement

        // int num= System.in.read();
        // it gives us the ascii value for the number we enter
        //
        // System.out.println(num - 48);
        // since it is ascii value we are subtracting it
        // but for bigger number we cant use number greater than 9 since it uses only one character at a time

        //To solve all this issues there is a class known as the BufferedReader and it belongs to the package java.io
        //It works with the IO
        //


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf= new BufferedReader(in);
        // buffered reader need to function will need a new object of the inputStreamReader
        // now we have to pass it to out object to get the input and it will take it in the form of the string
        // then we have to change this string into the integer by the parseInt method

        //bufferedreader can take the input from anywhere like file 
         


        // int num= Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        // we need to close the resources using the close method 

        // New METHOD
        // Scanner class was introduced in the version 1.5

        Scanner sc= new Scanner(System.in);
        // scanner class has various methods that we can use to take the input class

        int num2= sc.nextInt();
        //we use the nextInt method to take the input method for the input 
        
        System.out.println(num2);


    }
}
