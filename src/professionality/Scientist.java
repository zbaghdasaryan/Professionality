package professionality;

import java.util.Scanner;

public class Scientist {
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private int numberOfScientificPublications;
    private String rank = "";
    Scanner scanner = new Scanner(System.in);

    public Scientist(String firstName, String lastName, int age, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        System.out.println("Scientist's info:" + firstName + " " + lastName + " from " + nationality + " " + age +
                " years old" + ".");

    }

    public void scientistRank(int numberOfScientificPublications) {
        this.numberOfScientificPublications = numberOfScientificPublications;
        if (numberOfScientificPublications == 1) {
            rank = "Instructor";
            System.out.println("Scientist rank is " + rank);
        } else if (numberOfScientificPublications == 2) {
            rank = "Lecturer";
            System.out.println("Scientist rank is " + rank);
        } else if (numberOfScientificPublications == 3) {
            rank = "Assistant Professor";
            System.out.println("Scientist rank is " + rank);
        } else if (numberOfScientificPublications == 4) {
            rank = "Associate Professor";
            System.out.println("Scientist rank is " + rank);
        } else if (numberOfScientificPublications >= 5) {
            rank = "Professor";
            System.out.println("Scientist rank is " + rank);
        } else {
            System.out.println("The person is not a scientist yet");
        }
    }
}
