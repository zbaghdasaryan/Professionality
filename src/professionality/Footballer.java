package professionality;

public class Footballer {
    private int numberOnShirt;
    private String nameOfClub;
    private String nameOnShirt;
    private int pace;
    private int shooting;
    private int passing;
    private int dribbling;
    private int defending;
    private int physical;
    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }
    public void goal(){
       consolePrintAnimation.printInput("golassssssoooooo!!");
    }
    Footballer(int numberOnShirt,String nameOfClub,String nameOnShirt ){
        this.numberOnShirt = numberOnShirt;
        this.nameOfClub = nameOfClub;
        this.nameOnShirt = nameOnShirt;
    }


}
