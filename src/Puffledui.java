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

    public void studentComparison(Puffledui puffledui1, Puffledui puffledui2) {
        int sum1 = puffledui1.getWitchcraftLevel() + puffledui1.getTransgressionDistance() + puffledui1.getHonestyLevel() + puffledui1.getFaithfulnessLevel() + puffledui1.getDiligenceLevel();
        int sum2 = puffledui2.getWitchcraftLevel() + puffledui2.getTransgressionDistance() + puffledui2.getHonestyLevel() + puffledui2.getFaithfulnessLevel() + puffledui2.getDiligenceLevel();

        if (sum1 > sum2) {
            System.out.println(puffledui1.getName() + " лучший Пуффледуец, чем " + puffledui2.getName());
        }
        if (sum2 > sum1) {
            System.out.println(puffledui2.getName() + " лучший Пуффледуец чем " + puffledui1.getName());
        }
        if (sum2 == sum1) {
            System.out.println("Силы равны");
        }
    }
    public void printAboutFaculty (Puffledui puffledui) {
        System.out.println(puffledui.getName() + " присущи следующие свойства:\n) " + "Сила магии: "
                + puffledui.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + puffledui.getTransgressionDistance() + "\n"  + "трудолюбие: "
                + puffledui.getDiligenceLevel()+ "\n" + "верность: " + puffledui.getFaithfulnessLevel() + "\n" +
                "честность: " + puffledui.getHonestyLevel());
    }
}
