public class Gryffindor extends Hogwarts {

    int nobilityLevel;
    int honourLevel;
    int braveryLevel;


    public Gryffindor(String name, int witchcraftLevel, int transgressionDistance, int nobilityLevel, int honourLevel, int braveryLevel) {
        super(name, witchcraftLevel, transgressionDistance);
        this.nobilityLevel = nobilityLevel;
        this.honourLevel = honourLevel;
        this.braveryLevel = braveryLevel;
    }

    public int getNobilityLevel() {
        return nobilityLevel;
    }

    public int getHonourLevel() {
        return honourLevel;
    }

    public int getBraveryLevel() {
        return braveryLevel;
    }



/*
    public void studentComparison(Gryffindor gryffindor1, Gryffindor gryffindor2) {

        int sum1 = gryffindor1.getWitchcraftLevel() + gryffindor1.getTransgressionDistance() + gryffindor1.getNobilityLevel() + gryffindor1.getBraveryLevel() + gryffindor1.getHonourLevel();
        int sum2 = gryffindor2.getWitchcraftLevel() + gryffindor2.getTransgressionDistance() + gryffindor2.getNobilityLevel() + gryffindor2.getBraveryLevel() + gryffindor2.getHonourLevel();

        if (sum1 > sum2) {
            System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
        }
        if (sum2 > sum1) {
            System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
        }
        if (sum2 == sum1) {
            System.out.println("Силы равны");
        }
    }






    public void printAboutFaculty (Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() + " присущи следующие свойства: \n" + "Сила магии: "
                + gryffindor.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + gryffindor.getTransgressionDistance() + "\n" + "благородство: "
                + gryffindor.getNobilityLevel()+ "\n" + "честь: " + gryffindor.getHonourLevel() + "\n" +
                "храбрость: " + gryffindor.getBraveryLevel());
    }

 */

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "благородство: " + nobilityLevel + "\n" +
                "честь: " + honourLevel + "\n" +
                "храбрость: " + braveryLevel;
    }

    @Override
    public int sumByFaculty() {
        return this.honourLevel + this.braveryLevel + this.nobilityLevel;
    }

    @Override
    public void printMethod(String student1, String student2) {
        System.out.println(student1 + " лучший Гриффиндорец, чем " + student2);
    }
}
