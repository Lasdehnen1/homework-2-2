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
    public void studentComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        super.studentComparison(hogwarts1, hogwarts2);
    }

    public void printAboutFaculty (Kogtevran kogtevran) {
        System.out.println(kogtevran.getName() + " присущи следующие свойства:\n) " + "Сила магии: "
                + kogtevran.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + kogtevran.getTransgressionDistance() + "\n"  + "ум: "
                + kogtevran.getClevernessLevel()+ "\n" + "мудрость: " + kogtevran.getWisdomLevel() + "\n" +
                "остроумие: " + kogtevran.getWitLevel() + "\n" +
                "творчество: " + kogtevran.getCreationLevel());
    }
}
