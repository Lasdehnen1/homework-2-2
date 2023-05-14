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
    public String toString() {
        return super.toString() + "\n" +
                "хитрость: " + slyLevel + "\n" +
                "решительность: " + determinationLevel + "\n" +
                "амбициозность: " + ambitionLevel + "\n" +
                "находчивость: " + resourcefulnessLevel + "\n" +
                "жажда власти: " + lustForPowerLevel;
    }

    @Override
    public int sumByFaculty() {
        return this.ambitionLevel + this.slyLevel + this.determinationLevel + this.resourcefulnessLevel + this.lustForPowerLevel;
    }

    @Override
    public void printMethod(String student1, String student2) {
        System.out.println(student1 + " лучший Слизеринец, чем " + student2);
    }
}
