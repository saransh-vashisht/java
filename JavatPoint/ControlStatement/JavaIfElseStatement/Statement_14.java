// Nested Switch
// Java Program to demonstrate the use of Java Nested Switch


public class Statement_14 {
    public static void main(String[] args) {
        //C-CSE,E-ECE,M-Mechanical
        char branch='E';
        int collegeYear=2;

        switch (collegeYear) {
            case 1:
                System.out.println("English,Maths,Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating System,Java,Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors,Logic Switching Theory");
                        break;
                    case 'M':
                        System.out.println("Drawing,Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer Organization,Multimedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design,Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engine,Mechanical Vibration");
                        break;
                }
                break;               
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks,MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System,Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology,Thermal Engineering");
                        break;
                }
                break;
           
        }
    }
}
