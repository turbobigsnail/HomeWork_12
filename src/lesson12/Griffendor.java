package lesson12;

public class Griffendor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public void comparisonStudents(Griffendor studentNext) {
        int abilities1 = this.nobility + this.honour + this.bravery;
        int abilities2 = studentNext.nobility + studentNext.honour + studentNext.bravery;
        if (abilities1 > abilities2) {
            System.out.println(this.nameStudents + " сильнее " + studentNext.nameStudents);
        } else if (abilities2 > abilities1) {
            System.out.println(studentNext.nameStudents + " сильнее " + this.nameStudents);
        } else {
            System.out.println(this.nameStudents + " равен " + studentNext.nameStudents);
        }
    }

    public Griffendor(String nameStudents, int magic, int transgression, int nobility, int honour, int bravery) {
        this.nameStudents = nameStudents;
        this.magic = magic;
        this.transgression = transgression;
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return " я студент Griffendor " +
                "nobility= " + nobility +
                ", honour= " + honour +
                ", bravery= " + bravery +
                ", magic= " + magic +
                ", transgression= " + transgression +
                ", моё имя " + nameStudents;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
