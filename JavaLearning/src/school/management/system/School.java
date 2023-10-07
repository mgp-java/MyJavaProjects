package school.management.system;

import java.util.List;

/**
 * A School can have multiple teachers,students etc
 * Implements teachers and students using arraylist
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
/*
*
* list of teachers in the school
* list of students in the school
* */
   public School(List<Teacher> teachers,List<Student> students){
   this.teachers = teachers;
   this.students = students;
   totalMoneyEarned = 0;
   totalMoneySpent = 0;
   }
   /**/
    public List<Teacher> getTeachers() {
        return teachers;
    }
    /*Adds a teacher to the school*/
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    //return list of students in the school
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    //total money earned by the school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}

