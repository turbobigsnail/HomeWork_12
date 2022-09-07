package lesson12;

public abstract class Hogwarts {
    int magic;
    int transgression;
    String nameStudents;

    public void comparisonStudents(Hogwarts studentNext) {
        int abilities1 = this.magic + this.transgression;
        int abilities2 = studentNext.magic + studentNext.transgression;
        if (abilities1 > abilities2) {
            System.out.println(this.nameStudents + " сильнее " + studentNext.nameStudents);
        } else if (abilities2 > abilities1) {
            System.out.println(studentNext.nameStudents + " сильнее " + this.nameStudents);
        } else {
            System.out.println(this.nameStudents + " равен " + studentNext.nameStudents);
        }
    }
    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return nameStudents;
    }

    public void setName(String name) {
        this.nameStudents = name;
    }
}
