package professionality;

public class Journalism {

    private String name;
    private int age;
    private String gender;
    private boolean experiance;
    private int experiance_time;
    private String type;
    private double workDuration;

    public Journalism(String name, int age, String gender, boolean experiance, int experiance_time, String type, double workDuration) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experiance = experiance;
        this.experiance_time = experiance_time;
        this.type = type;
        this.workDuration = workDuration;
    }

    public double getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(double workDuration) {
        this.workDuration = workDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isExperiance() {
        return experiance;
    }

    public void setExperiance(boolean experiance) {
        this.experiance = experiance;
    }

    public int getExperiance_time() {
        return experiance_time;
    }

    public void setExperiance_time(int experiance_time) {
        this.experiance_time = experiance_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void takeInteveiw(String guest){
       System.out.println("Journalist take an interview from " + guest + ".");
    }
    public void writeText(){
        double temp = workDuration;
        while (experiance_time > 0){
            temp -= 0.1;
        }
        System.out.println("Journalist write text in " + temp + " hours.");
    }
    public void makeTVReport(){
        double temp = workDuration;
        while (experiance_time > 0){
            temp -= 0.2;
        }
        System.out.println("Journalist make TV report in " + temp + " hours.");
    }
}
