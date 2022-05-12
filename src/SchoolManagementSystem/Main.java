package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher michael = new Teacher(3, "Michael", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(michael);

        Student anna = new Student(1, "Anna", 4);
        Student chris = new Student(2, "Chris", 12);
        Student yusuf = new Student(3, "Yusuf", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(anna);
        studentList.add(chris);
        studentList.add(yusuf);

        School ghs = new School(teacherList, studentList);

        Teacher emily = new Teacher(6, "Megan", 900);
        ghs.addTeachers(emily);

        anna.payFees(5000);
        chris.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(lizzy);
        System.out.println(chris);
    }
}
