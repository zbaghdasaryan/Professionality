public class Programmer {
    private String name;
    private int age;
    private int lengthOfBeard;

    public Programmer(String name, int age, int lengthOfBeard) {
        this.name = name;
        this.age = age;
        this.lengthOfBeard = lengthOfBeard;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLengthOfBeard() {
        return lengthOfBeard;
    }

    public void evaluateProgrammer() {
        if(lengthOfBeard < 20) {
            System.out.println("You are a trainee coder!");
        } else if(lengthOfBeard < 50) {
            System.out.println("Congrats! You are a junior!");
        } else if(lengthOfBeard < 70) {
            System.out.println("You are a mid-developer!");
        } else if(lengthOfBeard <= 100) {
            System.out.println("You are definitely a senior developer!");
        } else if(lengthOfBeard > 100) {
            System.out.println("You are a lazy person!");
        }
    }

    public void code() {
        String s = "hello world";
        for (int i = 1; i <= s.length(); i++) {
            if(i == 6) {
                continue;
            }
            String upperCase = s.substring(i - 1, i).toUpperCase();
            String temp1 = s.substring(0, i-1);
            String temp2 = s.substring(i, s.length());
            System.out.println(temp1 + upperCase + temp2);
        }
    }
}
