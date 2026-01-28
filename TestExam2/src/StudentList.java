import java.io.IOException;
import java.util.ArrayList;

public class StudentList {
    private int size;
    private Student[]list;

    public StudentList(){
        list=new Student[size];
    }

    public void addStudent(Student student){

            for (int i=0;i<size;i++) {

                    list[i] = student;
            }



    }
    public Student getStudent(int index){
        return list[index];
    }
    public void remove(Student student) throws IllegalStateException {

            for (int i = 0; i < size; i++) {
                if (list[i] == student) {
                    list[i]=null;
                        list [i]=list[size];

                    size--;
                }
            }


            throw new IllegalStateException("Student not found");

    }
    public int getNumberOfStudents(){
        int sdu=0;
        for (int i=0;i<size;i++) {
            if (list[i] != null) {
                sdu++;
            }
        }return sdu;
    }
    public int getNumberOfStudentsByEducation(Education education){
        int edu=0;
        for (int i = 0; i < size; i++) {
            if (list[i].getEducation() == education) {
                edu++;
            }
        }
        return edu;
    }

    public Student[] getStudentsByEducation(Education education){
        ArrayList<Student>sdu=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (list[i].getEducation() == education) {
                sdu.add(list[i]);
            }
        }return sdu.toArray(new Student[0]);

    }
    public int getNumberOfHighSchoolStudents(){

        int hig=0;
        for (int i = 0; i < size; i++) {
           if (list[i].getEducation().getClass()==School.class){
               School school=(School) list[i].getEducation();
               if (school.getSchoolType().equals("HIGH_SCHOOL")){
                   hig++;
               }
            }
        }return hig;
    }
    private void doubleTheListCapacity(){
        this.size=list.length*2;
    }



}
