import java.util.Objects;

public class Hogwarts {
    private String name;
    private int witchcraftLevel;
    private int transgressionDistance;




    public Hogwarts(String name, int witchcraftLevel, int transgressionDistance) {
        this.name = name;
        this.witchcraftLevel = witchcraftLevel;
        this.transgressionDistance = transgressionDistance;
    }



    public String getName() {
        return name;
    }

    public int getWitchcraftLevel() {
        return witchcraftLevel;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }




    public void hogwartsComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        int sum1 = hogwarts1.getTransgressionDistance() + hogwarts1.getWitchcraftLevel();
        int sum2 = hogwarts2.getTransgressionDistance() + hogwarts2.getWitchcraftLevel();
        if (sum1 > sum2) {
            System.out.println(hogwarts1.getName() + " сильнее, чем " + hogwarts2.getName());
        }
        if (sum2 > sum1) {
            System.out.println(hogwarts2.getName() + " сильнее, чем " + hogwarts1.getName());
        }
        if (sum2 == sum1) {
            System.out.println("Силы равны");
        }
    }


}
