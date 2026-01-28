import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeListTextFilesTest
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\kasra\\OneDrive\\Desktop\\GradeList.txt");

        GradeList gradeList = new GradeList();

        try(Scanner in = new Scanner(file))
        {
            in.useDelimiter("[;\n]");
            while (in.hasNext())
            {
                String course = in.next().trim();
                int grade = Integer.parseInt(in.next().trim());
                gradeList.addGrade(new Grade(course, grade));
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("DIGGA");
        }

        System.out.println(gradeList);
    }
}
