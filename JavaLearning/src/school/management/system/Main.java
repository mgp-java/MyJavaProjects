package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"mellisa",500);
        Teacher vanderhorn = new Teacher(3,"Vanderholm",500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"tamasha",4);
        Student rakshith = new Student(2,"rakshith V",6);
        Student rabbi = new Student(3,"rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList,studentList);

        Teacher meghan = new Teacher(4,"meghan",1000);
        ghs.addTeacher(meghan);

        tamasha.payFees(5000);
        System.out.println("GHS has earned " + ghs.getTotalMoneyEarned());
        rakshith.payFees(4000);
        System.out.println("GHS has earned " + ghs.getTotalMoneyEarned());

        System.out.println("-----Making SCHOOL PAY SALARY-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent salary"+ lizzy.getName()+ " and now has "+ghs.getTotalMoneyEarned());
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent salary"+ vanderhorn.getName()+ " and now has "+ghs.getTotalMoneyEarned());

        System.out.println(rakshith);
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);
    }
}
