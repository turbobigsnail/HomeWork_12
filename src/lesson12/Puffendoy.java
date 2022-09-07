package lesson12;

public class Puffendoy extends Hogwarts {

    private int zeal;
    private int honesty;
    private int loyalty;

    public void comparisonStudents(Puffendoy studentNext) {
        int abilities1 = this.zeal + this.honesty + this.loyalty;
        int abilities2 = studentNext.zeal + studentNext.honesty + studentNext.loyalty;
        if (abilities1 > abilities2) {
            System.out.println(this.nameStudents + " сильнее " + studentNext.nameStudents);
        } else if (abilities2 > abilities1) {
            System.out.println(studentNext.nameStudents + " сильнее " + this.nameStudents);
        } else {
            System.out.println(this.nameStudents + " равен " + studentNext.nameStudents);
        }
    }

    public Puffendoy(String nameStudents, int magic, int transgression, int zeal, int honesty, int loyalty) {
        this.nameStudents = nameStudents;
        this.magic = magic;
        this.transgression = transgression;
        this.zeal = zeal;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    @Override
    public String toString() {
        return " я студент Puffendoy " +
                "zeal=" + zeal +
                ", honesty=" + honesty +
                ", loyalty=" + loyalty +
                ", magic=" + magic +
                ", transgression=" + transgression +
                ", моё имя '" + nameStudents;
    }

    public int getZeal() {
        return zeal;
    }

    public void setZeal(int zeal) {
        this.zeal = zeal;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
}
