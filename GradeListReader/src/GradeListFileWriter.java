import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class GradeListFileWriter {
    public static void main(String[] args) {
        Grade grade1 = new Grade("Math", 10);
        GradeList gradeList1 = new GradeList();
        gradeList1.addGrade(grade1);
        Grade grade2 = new Grade("Sep", 10);
        GradeList gradeList2 = new GradeList();
        gradeList2.addGrade(grade2);
        Grade grade3 = new Grade("Web", 10);
        GradeList gradeList3 = new GradeList();
        gradeList3.addGrade(grade3);

        try {
            File file =new File("C:\\Users\\kasra\\OneDrive\\Desktop\\GradeListWriter.txt");
            PrintWriter output = new PrintWriter(file);
            output.println(gradeList1);
            output.println(gradeList2);
            output.println(gradeList3);
            output.close();
        } catch (Exception e) {
            System.out.println("Could not create file: " + e.getMessage());
        }
        System.out.println("File created successfully");


    }
    }

