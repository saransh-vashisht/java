public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Navin");
        // it will give us the buffer size of the 16 bytes
        System.out.println(sb.capacity());
        // if we store something then it will store the string we have and it give us the extra space of 16 bytes 
        // it is done to provide us with the buffer of the 16 bytes for the case when the memory is filled and no other continous memory location is available so to avoid the relocation of the string it gives us the extra storage

        sb.append(" Reddy");
        // if we append here then it will be the permanent change in the string
        System.out.println(sb);

        String str=sb.toString();
        // we can convert the string sb of stringbuilder to the normal string by the tostring method.
        
        sb.deleteCharAt(2);
        System.out.println(sb);
        // we can use this method the string characters at the places we want to

        sb.insert(0, "Java ");
        System.out.println(sb);
        // using this method we can also insert the data into it 

        sb.setLength(30);
        // through this method we can set the specified length of the string and it will be fixed.

        sb.ensureCapacity(100);
        // this method can have the minimum capacity set for the string which will be kept aside while using it 


        // string buffer is thread safe and the string builder is not . 
        // string buffer and the string builder have the similar methods 
        



    }
}
