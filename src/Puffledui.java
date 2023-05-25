public class Puffledui extends Hogwarts {
    int diligenceLevel;
    int faithfulnessLevel;
    int honestyLevel;


    public Puffledui(String name, int witchcraftLevel, int transgressionDistance, int diligenceLevel, int faithfulnessLevel, int honestyLevel) {
        super(name, witchcraftLevel, transgressionDistance);
        this.diligenceLevel = diligenceLevel;
        this.faithfulnessLevel = faithfulnessLevel;
        this.honestyLevel = honestyLevel;
    }

    public int getDiligenceLevel() {
        return diligenceLevel;
    }

    public int getFaithfulnessLevel() {
        return faithfulnessLevel;
    }

    public int getHonestyLevel() {
        return honestyLevel;
    }



    @Override
    public String toString() {
        return super.toString() + "\n" +
                "трудолюбие: " + diligenceLevel + "\n" +
                "верность: " + faithfulnessLevel + "\n" +
                "честность: " + honestyLevel;
    }

    @Override
    public int sumByFaculty() {
        return this.honestyLevel + this.faithfulnessLevel + this.diligenceLevel;
    }

    @Override
    public void printMethod(String student1, String student2) {
        System.out.println(student1 + " лучший Пуффледуец, чем " + student2);
    }
}
