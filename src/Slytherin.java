public class Slytherin extends Hogwarts {
    int slyLevel;
    int determinationLevel;
    int ambitionLevel;
    int resourcefulnessLevel;
    int lustForPowerLevel;

    public Slytherin(String name, int witchcraftLevel, int transgressionDistance, int slyLevel, int determinationLevel, int ambitionLevel, int resourcefulnessLevel, int lustForPowerLevel) {
        super(name, witchcraftLevel, transgressionDistance);
        this.slyLevel = slyLevel;
        this.determinationLevel = determinationLevel;
        this.ambitionLevel = ambitionLevel;
        this.resourcefulnessLevel = resourcefulnessLevel;
        this.lustForPowerLevel = lustForPowerLevel;
    }

    public int getSlyLevel() {
        return slyLevel;
    }

    public int getDeterminationLevel() {
        return determinationLevel;
    }

    public int getAmbitionLevel() {
        return ambitionLevel;
    }

    public int getResourcefulnessLevel() {
        return resourcefulnessLevel;
    }

    public int getLustForPowerLevel() {
        return lustForPowerLevel;
    }

    @Override
    public void studentComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        super.studentComparison(hogwarts1, hogwarts2);
    }

    public void printAboutFaculty (Slytherin slytherin) {
        System.out.println(slytherin.getName() + " присущи следующие свойства:\n) " + "Сила магии: "
                + slytherin.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + slytherin.getTransgressionDistance() + "\n"  + "хитрость: "
                + slytherin.getSlyLevel()+ "\n" + "решительность: " + slytherin.getDeterminationLevel()+ "\n" +
                "амбициозность: " + slytherin.getAmbitionLevel() + "\n" +
                "находчивость: " + slytherin.getResourcefulnessLevel() + "\n" +
                "жажда власти: " + slytherin.getLustForPowerLevel());
    }
}
