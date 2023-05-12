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
    public void studentComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        super.studentComparison(hogwarts1, hogwarts2);
    }

    public void printAboutFaculty (Puffledui puffledui) {
        System.out.println(puffledui.getName() + " присущи следующие свойства:\n) " + "Сила магии: "
                + puffledui.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + puffledui.getTransgressionDistance() + "\n"  + "трудолюбие: "
                + puffledui.getDiligenceLevel()+ "\n" + "верность: " + puffledui.getFaithfulnessLevel() + "\n" +
                "честность: " + puffledui.getHonestyLevel());
    }
}
