import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStream2 {
    public static void main(String[] args) {
        FileInputStream file = null;
        DataInputStream data = null;
        
        try {
            file = new FileInputStream("testout5.txt");
            data = new DataInputStream(file);

            int intValue = data.readInt();
            System.out.println("Read int: " + intValue);

            boolean boolValue = data.readBoolean();
            System.out.println("Read boolean: " + boolValue);

            byte byteValue = data.readByte();
            System.out.println("Read byte: " + byteValue);

            short shortValue = data.readShort();
            System.out.println("Read short: " + shortValue);

            int anotherIntValue = data.readInt();
            System.out.println("Read another int: " + anotherIntValue);

            long longValue = data.readLong();
            System.out.println("Read long: " + longValue);

            float floatValue = data.readFloat();
            System.out.println("Read float: " + floatValue);

            double doubleValue = data.readDouble();
            System.out.println("Read double: " + doubleValue);

            char charValue = data.readChar();
            System.out.println("Read char: " + charValue);

            String utfString = data.readUTF();
            System.out.println("Read UTF String: " + utfString);
            
            System.out.println("Success....");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        } finally {
            // Ensure the DataInputStream is closed
            try {
                if (data != null) {
                    data.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.err.println("Failed to close stream: " + e.getMessage());
            }
        }
    }
}

// here we have input the data for out output file 
