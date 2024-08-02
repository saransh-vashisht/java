import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// we can make the list of the objects of class student
class Studentry {
    int age;
    String name;
    public Studentry(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}


public class CollectionsSorting {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        // it's not necessary to add the datatype on the right hand side if we have specified on the left side
        // in the earlier versions it was necessary to add this value like that 

        nums.add(4);
        nums.add(3);
        nums.add(7);
        nums.add(9);

        System.out.println(nums);
 
        // now we want to sort this values

        Collections.sort(nums);

        System.out.println(nums);


        // If we want to sort the values based on the one's place in the numbers we have stored like the 31 me 1 wala number

        // for this we can use the comparator and the comparator is an interface

        // now we can implement interface through a class and also with the help of anonymous inner class

        Comparator<Integer> com= new Comparator<Integer>() {
            public int compare(Integer  i, Integer j){

                // we will use the compare method to compare the two values that we want to compare 

                // if we return 1 then it will swap and if we return -1 it will not swap

                if (i%10> j%10) {
                    
                    return 1;
                } else{
                    return -1;
                }


            }
        };


        List<Integer> nums1= new ArrayList<>();
        nums1.add(43);
        nums1.add(31);
        nums1.add(72);
        nums1.add(29);

        Collections.sort(nums1,com);
        // we need to give the comparator object com as the way by which we can give the output to the values we have
        System.out.println(nums1);


        List<String> nums3= new ArrayList<>();
        nums3.add("Saransh");
        nums3.add("Aashi");
        nums3.add("Gojo");
        nums3.add("Sukuna");
        nums3.add("Thorfinn");
        nums3.add("PowerPuffGirls");


        Comparator<String> com1= new Comparator<String>() {
           public int compare(String s1, String s2){

            if (s1.length()>s2.length()) {
                return 1;
            } else {
                return -1;
            }
           } 
        };

        System.out.println(nums3);
        Collections.sort(nums3,com1);

        System.out.println(nums3);

        // above we have used the comparator to sort strings based on their lengths



        // we can make the list of students object class 

        List<Studentry> studs= new ArrayList<>();

        studs.add(new Studentry(21,"Leich"));
        studs.add(new Studentry(12, "John"));
        studs.add(new Studentry(10, "Parul"));
        studs.add(new Studentry(20, "Kiran"));
        

        System.out.println(studs);

        // to print them one by one we can use the enhanced for loop

        for (Studentry s : studs) {
            System.out.println(s);
        }

        // Defining comparator for the sorting of the object

        Comparator<Studentry> com2= new Comparator<Studentry>() {
            public int compare(Studentry i, Studentry j){
               if (i.age>j.age) {
                return 1;
               } else {
                return -1;
               } 
            }
        };


        //  we can also convert this comparator into one line using the lambda expression

        // FIRST we can remove the object definition and also the method introduction and directly pass the arguments

        Comparator<Studentry> com3= (Studentry i, Studentry j)->
        {
               if (i.age>j.age) {
                return 1;
               } else {
                return -1;
               } 
            };


        // also now we can remove the if else  by using the ternary operator

        Comparator<Studentry> com4= (Studentry i, Studentry j) ->{
          return  i.age>j.age?1:-1;
        };

        // since it is only one return statement we can remove the brackets and also the datatype of arguments is also no need to be specified

        Comparator<Studentry> com5= ( i, j) ->  i.age>j.age?1:-1;
        // we do not have to mention the return statement
        
      

       




        System.out.println("after using the comparator");

        // here the normal sort method will give an error as you can see below

        // Collections.sort(studs);

        Collections.sort(studs,com2);

        for (Studentry s : studs) {
            System.out.println(s);

        }








    }
}
