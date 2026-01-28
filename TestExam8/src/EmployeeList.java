import java.util.Arrays;

public class EmployeeList {
    private int size;
    private Employee[]employees;
    
    public EmployeeList(int maxNumberOfEmployees){
        this.size=0;
        this.employees=new Employee[maxNumberOfEmployees];
    }
    public void addEmployee(Employee employee){
        for (int i = 0; i <size; i++) {
            if (employees[i]==null){
                employees[i]=employee;
                size++;
            }
        }
    }
    public void removeEmployee(Employee employee){
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(employee)){
                employees[i]=employees[size-1];
                employees[size-1]=null;
            }
        }

        size--;
    }
    public int getNumberOfEmployees(){
        return size;
    }
    public Employee[] getAllEmployees(){
        return employees;
    }
    public double getTotalEarningsPerWeek(){
        double totalEarnings=0;
        for(int i=0;i<size;i++){
            if (employees[i] instanceof HourlyEmployee){
                totalEarnings+=employees[i].earningsPerWeek();
            }
        }return totalEarnings;
    }
    @Override
    public String toString(){
        return size+"";
    }
    public boolean equals(Object obj){
        if (obj==null||getClass()!=obj.getClass())return false;
        EmployeeList other=(EmployeeList) obj;
        return Arrays.equals(employees, other.employees) &&size==other.size;
    }


    
}
