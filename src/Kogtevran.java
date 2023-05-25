public class Kogtevran extends Hogwarts {
    int clevernessLevel;
    int wisdomLevel;
    int witLevel;
    int creationLevel;


    public Kogtevran(String name, int witchcraftLevel, int transgressionDistance, int clevernessLevel, int wisdomLevel, int witLevel, int creationLevel) {
        super(name, witchcraftLevel, transgressionDistance);
        this.clevernessLevel = clevernessLevel;
        this.wisdomLevel = wisdomLevel;
        this.witLevel = witLevel;
        this.creationLevel = creationLevel;
    }

    public int getClevernessLevel() {
        return clevernessLevel;
    }

    public int getWisdomLevel() {
        return wisdomLevel;
    }

    public int getWitLevel() {
        return witLevel;
    }

    public int getCreationLevel() {
        return creationLevel;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "ум: " + clevernessLevel + "\n" +
                "мудрость: " + wisdomLevel + "\n" +
                "остроумие: " + witLevel + "\n"  +
                "творчество: " + creationLevel;
    }

    @Override
    public int sumByFaculty() {
        return this.wisdomLevel + this.creationLevel + this.clevernessLevel + this.witLevel;
    }

    @Override
    public void printMethod(String student1, String student2) {
        System.out.println(student1 + " лучший Когтевранец, чем " + student2);
    }
}
