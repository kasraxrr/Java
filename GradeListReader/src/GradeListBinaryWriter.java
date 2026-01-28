import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GradeListBinaryWriter implements Serializable {
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
            FileOutputStream fos=new FileOutputStream("C:\\Users\\kasra\\OneDrive\\Desktop\\GradeList.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            System.out.println("writing the files");
           oos.writeObject(gradeList1);
           oos.writeObject(gradeList2);
           oos.writeObject(gradeList3);

            oos.close();
        }

        catch (Exception e) {
            System.out.println("fuck u");
        }
        System.out.println("File created successfully");

    }


    }

