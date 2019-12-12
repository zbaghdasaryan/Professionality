public class Accountant {
    private String name;
    private String surName;
    private int experience;

    public Accountant() {
        name = "name";
        surName = "surname";
        experience = 0;
    }

    public void financialReport() {
        if (experience > 2) {
            System.out.println("Accountant " + name + " " + surName + " can make annual financial reports.");
        } else {
            System.out.println("Accountant " + name + " " + surName + " can't make annual financial reports.");
        }
    }

    public void financialAnalyse() {
        if (experience > 5) {
            System.out.println("Accountant " + name + " " + surName + " can make financial analyses.");
        } else {
            System.out.println("Accountant " + name + " " + surName + " can't make financial analyses.");
        }
    }



}