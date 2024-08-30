import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class InetAddress_2 {
    public static void main(String[] args) throws Exception {
        InetAddress ip=Inet4Address.getByName("www.javatpoint.com");
        InetAddress ip1[]= InetAddress.getAllByName("www.javatpoint.com");
        byte addr[]={72,3,2,12};
        System.out.println("ip: "+ip);
        System.out.println("ip1: "+ ip1);
        InetAddress ip2=InetAddress.getByAddress(addr);
        System.out.println("ip2: "+ ip2);
        System.out.println("Address: "+ Arrays.toString(ip.getAddress()));
        System.out.println("Host Address: "+ ip.getHostAddress());
        System.out.println("isAnyLocalAddress: "+ip.isAnyLocalAddress());
        System.out.println("isLinkLocakAdress: "+ ip.isLinkLocalAddress());
        System.out.println("isLoopbackAddress: "+ ip.isLoopbackAddress());
        System.out.println("isMCGlobal: "+ ip.isMCGlobal());
        System.out.println("isMCLinkLocal: "+ ip.isMCLinkLocal());
        System.out.println("isMCOrgLocal: "+ ip.isMCOrgLocal());
        System.out.println("isMCSiteLocal: "+ ip.isMCSiteLocal());
        System.out.println("isMulticastAddress: "+ ip.isMulticastAddress());
        System.out.println("isSiteLocalAddress: "+ ip.isSiteLocalAddress());
        System.out.println("hashCode: "+ip.hashCode());
        System.out.println("is ip1==ip2: "+ip.equals(ip2));
        
        // Sure, let's go through this Java code step by step. This program demonstrates the use of the `InetAddress` and `Inet4Address` classes to work with IP addresses in Java.

        // ### Import Statements
        
        // ```java
        // import java.net.Inet4Address;  
        // import java.util.Arrays;  
        // import java.net.InetAddress;  
        // ```
        
        // These import statements are bringing in necessary classes from the Java standard library:
        // - `Inet4Address`: A subclass of `InetAddress` specifically for handling IPv4 addresses.
        // - `Arrays`: A utility class with methods to manipulate arrays (used for printing the IP address).
        // - `InetAddress`: The superclass for both IPv4 and IPv6 addresses, providing a way to represent an IP address.
        
        // ### Main Class and Method
        
        // ```java
        // public class InetDemo2  
        // {  
        //     public static void main(String[] arg) throws Exception  
        //     {  
        // ```
        
        // This is the main class definition and the `main` method which is the entry point of the Java application. The `main` method declares that it throws `Exception`, which means it can throw any exception that occurs during its execution.
        
        // ### Resolving Hostnames and IP Addresses
        
        // ```java
        //         InetAddress ip =  Inet4Address.getByName("www.javatpoint.com");  
        //         InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");  
        //         byte addr[]={72, 3, 2, 12};  
        // ```
        
        // 1. `InetAddress ip = Inet4Address.getByName("www.javatpoint.com");`
        //    - This line resolves the hostname "www.javatpoint.com" to an IPv4 address using `Inet4Address.getByName`. The result is stored in `ip`.
        
        // 2. `InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");`
        //    - This line resolves the hostname "www.javatpoint.com" to all possible IP addresses associated with it, storing them in an array of `InetAddress`.
        
        // 3. `byte addr[]={72, 3, 2, 12};`
        //    - This line creates a byte array representing the IP address `72.3.2.12`.
        
        // ### Printing IP Address Information
        
        // ```java
        //         System.out.println("ip : "+ip);  
        //         System.out.print("\nip1 : "+Arrays.toString(ip1));  
        //         InetAddress ip2 =  InetAddress.getByAddress(addr);  
        //         System.out.print("\nip2 : "+ip2);  
        //         System.out.print("\nAddress : " +Arrays.toString(ip.getAddress()));  
        //         System.out.print("\nHost Address : " +ip.getHostAddress());  
        // ```
        
        // 1. `System.out.println("ip : "+ip);`
        //    - Prints the `ip` object, which calls the `toString()` method of `InetAddress`, displaying the IP address of "www.javatpoint.com".
        
        // 2. `System.out.print("\nip1 : "+Arrays.toString(ip1));`
        //    - Prints the array `ip1` using `Arrays.toString()`, which converts the array to a human-readable string.
        
        // 3. `InetAddress ip2 = InetAddress.getByAddress(addr);`
        //    - Creates an `InetAddress` object from the byte array `addr` and assigns it to `ip2`.
        
        // 4. `System.out.print("\nip2 : "+ip2);`
        //    - Prints the `ip2` object, which displays the IP address `72.3.2.12`.
        
        // 5. `System.out.print("\nAddress : " +Arrays.toString(ip.getAddress()));`
        //    - Prints the byte array representation of the IP address in `ip`.
        
        // 6. `System.out.print("\nHost Address : " +ip.getHostAddress());`
        //    - Prints the IP address of `ip` in string format.
        
        // ### Checking Address Types and Properties
        
        // ```java
        //         System.out.print("\nisAnyLocalAddress : " +ip.isAnyLocalAddress());  
        //         System.out.print("\nisLinkLocalAddress : " +ip.isLinkLocalAddress());  
        //         System.out.print("\nisLoopbackAddress : " +ip.isLoopbackAddress());  
        //         System.out.print("\nisMCGlobal : " +ip.isMCGlobal());  
        //         System.out.print("\nisMCLinkLocal : " +ip.isMCLinkLocal());  
        //         System.out.print("\nisMCNodeLocal : " +ip.isMCNodeLocal());  
        //         System.out.print("\nisMCOrgLocal : " +ip.isMCOrgLocal());  
        //         System.out.print("\nisMCSiteLocal : " +ip.isMCSiteLocal());  
        //         System.out.print("\nisMulticastAddress : " +ip.isMulticastAddress());  
        //         System.out.print("\nisSiteLocalAddress : " +ip.isSiteLocalAddress());  
        // ```
        
        // These lines print various properties of the IP address `ip`:
        
        // 1. `isAnyLocalAddress()`: Checks if the address is a wildcard address.
        // 2. `isLinkLocalAddress()`: Checks if the address is a link-local address.
        // 3. `isLoopbackAddress()`: Checks if the address is a loopback address.
        // 4. `isMCGlobal()`: Checks if the address is a global multicast address.
        // 5. `isMCLinkLocal()`: Checks if the address is a link-local multicast address.
        // 6. `isMCNodeLocal()`: Checks if the address is a node-local multicast address.
        // 7. `isMCOrgLocal()`: Checks if the address is an organization-local multicast address.
        // 8. `isMCSiteLocal()`: Checks if the address is a site-local multicast address.
        // 9. `isMulticastAddress()`: Checks if the address is a multicast address.
        // 10. `isSiteLocalAddress()`: Checks if the address is a site-local address.
        
        // ### Other Methods and Comparisons
        
        // ```java
        //         System.out.print("\nhashCode : " +ip.hashCode());  
        //         System.out.print("\n Is ip1 == ip2 : " +ip.equals(ip2));  
        // }  
        // }
        // ```
        
        // 1. `System.out.print("\nhashCode : " +ip.hashCode());`
        //    - Prints the hash code of the `ip` object.
        
        // 2. `System.out.print("\n Is ip1 == ip2 : " +ip.equals(ip2));`
        //    - Compares the `ip` object with `ip2` to check if they represent the same IP address.
        
        // ### Summary
        
        // - The program resolves the hostname "www.javatpoint.com" to its IP address(es).
        // - It creates an IP address from a byte array and checks various properties of the IP addresses.
        // - It prints details like the actual IP address, its byte representation, host address, and various properties such as whether it is a loopback, link-local, or multicast address.
        // - It compares two `InetAddress` objects to see if they represent the same IP address.


    }
}
