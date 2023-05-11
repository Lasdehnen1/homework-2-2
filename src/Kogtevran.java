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

    public void studentComparison(Kogtevran kogtevran1, Kogtevran kogtevran2) {
        int sum1 = kogtevran1.getWitchcraftLevel() + kogtevran1.getTransgressionDistance() + kogtevran1.getCreationLevel() + kogtevran1.getClevernessLevel() + kogtevran1.getWitLevel() + kogtevran1.getWisdomLevel();
        int sum2 = kogtevran2.getWitchcraftLevel() + kogtevran2.getTransgressionDistance() + kogtevran2.getCreationLevel() + kogtevran2.getClevernessLevel() + kogtevran2.getWitLevel() + kogtevran2.getWisdomLevel();

        if (sum1 > sum2) {
            System.out.println(kogtevran1.getName() + " лучший Гриффиндорец, чем " + kogtevran2.getName());
        }
        if (sum2 > sum1) {
            System.out.println(kogtevran2.getName() + " лучший Гриффиндорец, чем " + kogtevran1.getName());
        }
        if (sum2 == sum1) {
            System.out.println("Силы равны");
        }
    }
    public void printAboutFaculty (Kogtevran kogtevran) {
        System.out.println(kogtevran.getName() + " присущи следующие свойства:\n) " + "Сила магии: "
                + kogtevran.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + kogtevran.getTransgressionDistance() + "\n"  + "ум: "
                + kogtevran.getClevernessLevel()+ "\n" + "мудрость: " + kogtevran.getWisdomLevel() + "\n" +
                "остроумие: " + kogtevran.getWitLevel() + "\n" +
                "творчество: " + kogtevran.getCreationLevel());
    }
}
