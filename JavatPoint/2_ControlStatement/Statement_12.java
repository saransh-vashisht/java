
// Java For-Each loop

public class Statement_12 {
    public static void main(String[] args) {
        // java provides us with an enhanced for each loop which is made to traverse the data structures like the array or collection
        // for this we do not have the need to update the loop variable

        // for(data_type var:array_name/collection_name){
        //     //statements
        // }

        // TODO Auto-generated method stub
        String[] names={"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for(String name:names){
            System.out.println(name);
        }

    }
}
