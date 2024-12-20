package school.management.system;
/*
* This class keeps track of teacher class
* */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void receiveSalary(int salary){
     salaryEarned+=salary;
     School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "The name of the teacher is" +name+ "and the salary received by this teacher is" + salaryEarned;
    }
}
