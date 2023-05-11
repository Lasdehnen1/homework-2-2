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

    public void studentComparison(Slytherin slytherin1, Slytherin slytherin2) {
        int sum1 = slytherin1.getWitchcraftLevel() + slytherin1.getTransgressionDistance() + slytherin1.getAmbitionLevel() + slytherin1.getDeterminationLevel() + slytherin1.getResourcefulnessLevel() + slytherin1.getLustForPowerLevel() + slytherin1.getSlyLevel();
        int sum2 = slytherin2.getWitchcraftLevel() + slytherin2.getTransgressionDistance() +  slytherin2.getAmbitionLevel() + slytherin2.getDeterminationLevel() + slytherin2.getResourcefulnessLevel() + slytherin2.getLustForPowerLevel() + slytherin2.getSlyLevel();

        if (sum1 > sum2) {
            System.out.println(slytherin1.getName() + " лучший Гриффиндорец, чем " + slytherin2.getName());
        }
        if (sum2 > sum1) {
            System.out.println(slytherin2.getName() + " лучший Гриффиндорец, чем " + slytherin1.getName());
        }
        if (sum2 == sum1) {
            System.out.println("Силы равны");
        }
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
