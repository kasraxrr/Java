import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriter1 {
    public static void main(String[] args) throws IOException {
        String name;
        int age;
        String country;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = scanner.nextLine();
        System.out.println("Enter your age : ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your country : ");
        country = scanner.nextLine();




        try {
            FileWriter fWriter =new FileWriter("C:\\Users\\kasra\\OneDrive\\Desktop\\kasra.txt",true);
            PrintWriter output = new PrintWriter(fWriter);
            output.println("Name  : " + name);
            output.println("Country : " + country);
            output.println("Age : " + age);
            for (int i =0;i<1000;i++){
                output.println(i+" : I AM BATMAN ");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Could not create file: " + e.getMessage());
        }
        System.out.println("File created successfully");


    }

}



