package professionality;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    private int yearOfStudy;
    private boolean onScholarship;
    private int daysTillExam;
    private String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    Scanner scanner = new Scanner(System.in);

    public Student(String firstName, String lastName, int yearOfStudy, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.gpa = gpa;
        System.out.println("Student's data:" + firstName + " " + lastName + "  " + yearOfStudy + " year student with the gpa " + gpa
                + ".");
    }

    public void hasScholarship() {
        if (gpa >= 3.2) {
            onScholarship = true;
            System.out.println("This student has Scholarship.");
        }
    }

    public void goToUni() {
        System.out.print("Input the day of week: ");
        List<String> list = Arrays.asList(dayOfWeek);
        String day = scanner.nextLine();
        if (list.contains(day)) {
            System.out.println("Today is Uni day !!!");
        } else {
            System.out.println("Today is weekend !!!");
        }

    }

    public void studyForExam() {
        System.out.print("How many days are left before exam?");
        int days = scanner.nextInt();
        if (days == 1) {
            System.out.println("Now it's the exact time to prepare for exam.");
        } else {
            System.out.println("You can continue watching films or read book or whatever :D");
        }
    }
}
