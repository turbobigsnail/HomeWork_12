package lesson12;

public class Main {
    public static void main(String[] args) {
        Griffendor harryPotter = new Griffendor("Harry Potter", 10, 30, 66, 45, 60);
        Griffendor hermioneGranger = new Griffendor("Hermione Granger", 25, 90, 87, 55, 88);
        Puffendoy zahariaSmith = new Puffendoy("Zaharia Smith", 22, 46, 77, 12, 32);
        Puffendoy justinBieber = new Puffendoy("Justin Bieber", 22, 46, 77, 12, 32);
        Cogtevrane сhoChang = new Cogtevrane("Cho Chang", 99, 99, 99, 99, 99, 99);
        Cogtevrane padmePatile = new Cogtevrane("Padme Patile", 34, 44, 77, 43, 9, 27);
        Slytherin dracoLuciusMalfoy = new Slytherin("Draco Lucius Malfoy", 1, 1, 1, 1, 100, 1, 100);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 2, 2, 2, 2, 99, 2, 99);

        System.out.println(hermioneGranger);
        harryPotter.comparisonStudents(hermioneGranger);
        harryPotter.comparisonStudents(сhoChang);
        justinBieber.comparisonStudents(dracoLuciusMalfoy);
        zahariaSmith.comparisonStudents(justinBieber);


    }
}
