import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFilereader {
    public static void main(String[] args) throws IOException {
        Scanner keyboard=new Scanner(System.in);



        File file=new File("C:\\Users\\kasra\\OneDrive\\Desktop\\kasra.txt");
        Scanner scanner=new Scanner(file);
        if (!file.exists()){
            System.out.println("the file dose not exist");
            scanner.close();
        }

        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            System.out.println(text);
        }
        scanner.close();


    }
}
