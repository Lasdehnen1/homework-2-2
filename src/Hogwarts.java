public abstract class Hogwarts {
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

/*
    public void studentComparisonDiffFaculties(Hogwarts hogwarts1, Hogwarts hogwarts2) {
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

 */

    @Override
    public String toString() {
        return name + " присущи следующие свойства: \n" +
                "Сила магии: " + witchcraftLevel +
                "\n" + "Расстояние трансгрессии: " + transgressionDistance;
    }

    public int sumByHogwarts() {
        return witchcraftLevel + transgressionDistance;
    }

    public abstract int sumByFaculty();

    public abstract void printMethod (String student1, String student2);

    private void compareByFaculty(Hogwarts hogwarts) {
        int sum1 = this.sumByHogwarts() + this.sumByFaculty();
        int sum2 = hogwarts.sumByHogwarts() + hogwarts.sumByFaculty();
        if (sum1 > sum2) {
            printMethod(this.getName(), hogwarts.getName());
        }
        if (sum1 < sum2) {
            printMethod(hogwarts.getName(), this.getName());
        } if (sum1 == sum2) {
            System.out.println("Силы равны");
        }
    }
    private void compareByHogwarts(Hogwarts hogwarts) {
        int sum1 = this.sumByHogwarts() + this.sumByFaculty();
        int sum2 = hogwarts.sumByHogwarts() + hogwarts.sumByFaculty();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " сильнее, чем " + hogwarts.getName());
        }
        if (sum1 < sum2) {
            System.out.println(hogwarts.getName() + " сильнее, чем " + this.getName());
        } if (sum1 == sum2) {
            System.out.println("Силы равны");
        }
    }

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareByFaculty(hogwarts);
        } else {
            compareByHogwarts(hogwarts);
        }
    }











}