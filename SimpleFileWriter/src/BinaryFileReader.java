import java.io.*;

public class BinaryFileReader {
    public static void main(String[] args) throws IOException {
        int numbers;

        FileInputStream fos = new FileInputStream("C:\\Users\\kasra\\OneDrive\\Desktop\\numbers.dat");
        DataInputStream dos = new DataInputStream(fos);
        System.out.println("Reading the numbers");

            try {
                for (int i=0;i<7;i++){
                    numbers = dos.readInt();
                    System.out.print(numbers +" ");
                }
      
                String s=dos.readUTF();
                System.out.println(s);
            } catch (EOFException e) {
                System.out.println("reached end of files ");
            }



        dos.close();
        System.out.println("\nDone");

    }
}
