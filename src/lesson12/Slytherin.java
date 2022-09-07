package lesson12;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public void comparisonStudents(Slytherin studentNext) {
        int abilities1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int abilities2 = studentNext.cunning + studentNext.determination + studentNext.ambition + studentNext.resourcefulness + this.lustForPower;
        if (abilities1 > abilities2) {
            System.out.println(this.nameStudents + " сильнее " + studentNext.nameStudents);
        } else if (abilities2 > abilities1) {
            System.out.println(studentNext.nameStudents + " сильнее " + this.nameStudents);
        } else {
            System.out.println(this.nameStudents + " равен " + studentNext.nameStudents);
        }
    }

    public Slytherin(String nameStudents, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        this.nameStudents = nameStudents;
        this.magic = magic;
        this.transgression = transgression;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return " я студент Slytherin " +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", magic=" + magic +
                ", transgression=" + transgression +
                ", моё имя " + nameStudents;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
