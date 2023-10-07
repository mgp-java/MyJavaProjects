package school.management.system;
/*
* This class keep track of the students fees,name etc
*
* */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;

    public Student(int id,String name,int grade){
        this.feespaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade=grade;
    }
    //Not going to change the student's name,students id but grade may change

    public void setGrade(int grade){
        this.grade = grade;
    }
    public void payFees(int fees){
        feespaid += fees;
        School.updateTotalMoneyEarned(feespaid);
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getFeespaid() {
        return feespaid;
    }
    //return the remaining fees
        public int getRemainingFees(){
        return feesTotal - feespaid;
    }
    public String toString(){
        return "Students name"+name+"Total fees paid so far $"+feespaid;
    }
}
