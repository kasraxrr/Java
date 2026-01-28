import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter {
    public static void main(String[] args)throws IOException {
        int[] numbers={1,2,3,4,5,6,7};
        String S="kasra joon";

        FileOutputStream fos=new FileOutputStream("C:\\Users\\kasra\\OneDrive\\Desktop\\numbers.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        System.out.println("writing the files");
        for (int i=0;i<numbers.length;i++){
            dos.writeInt(numbers[i]);
        }
        dos.writeUTF(S);
        dos.close();
        System.out.println("Done");
    }


}
