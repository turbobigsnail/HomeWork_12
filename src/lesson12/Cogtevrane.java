package lesson12;

public class Cogtevrane extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public void comparisonStudents(Cogtevrane studentNext) {
        int abilities1 = this.mind + this.wisdom + this.wit + this.creation;
        int abilities2 = studentNext.mind + studentNext.wisdom + studentNext.wit + studentNext.creation;
        if (abilities1 > abilities2) {
            System.out.println(this.nameStudents + " сильнее " + studentNext.nameStudents);
        } else if (abilities2 > abilities1) {
            System.out.println(studentNext.nameStudents + " сильнее " + this.nameStudents);
        } else {
            System.out.println(this.nameStudents + " равен " + studentNext.nameStudents);
        }
    }

    public Cogtevrane(String nameStudents, int magic, int transgression, int mind, int wisdom, int wit, int creation) {
        this.nameStudents = nameStudents;
        this.magic = magic;
        this.transgression = transgression;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return " я студент Cogtevrane " +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                ", magic=" + magic +
                ", transgression=" + transgression +
                ", моё имя '" + nameStudents;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
