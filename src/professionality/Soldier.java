package professionality;

public class Soldier {
    private String name;
    private String surname;
    private int age;
    private String nation;
    private String bloodType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealthPercent() {
        return healthPercent;
    }

    public void setHealthPercent(int healthPercent) {
        this.healthPercent = healthPercent;
    }

    public boolean isReadyToBattle() {
        return readyToBattle;
    }

    public void setReadyToBattle(boolean readyToBattle) {
        this.readyToBattle = readyToBattle;
    }

    private String weapon;
    private int healthPercent;
    private boolean readyToBattle;


    public Soldier() {
    }

    public Soldier(String name, String surname, int age, String nation, String bloodType, String weapon, int healthPercent, boolean readyToBattle) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nation = nation;
        this.bloodType = bloodType;
        this.weapon = weapon;
        this.healthPercent = healthPercent;
        this.readyToBattle = readyToBattle;
    }

    public void fight() {
        if (healthPercent > 80) {
            System.out.println("your soldiers won the enemy");
        } else System.out.println("Soldier has died");
    }

    public static void creatArmy(int countOfSoldiers) {
        Soldier[] vasht = new Soldier[countOfSoldiers];
        for (int i = 0; i < countOfSoldiers; i++) {
            vasht[i] = new Soldier();
        }
        for (Soldier i : vasht) {
            System.out.println(i);
        }
    }
}
