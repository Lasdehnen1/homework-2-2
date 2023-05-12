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

    @Override
    public void studentComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        super.studentComparison(hogwarts1, hogwarts2);
    }



    public void printAboutFaculty (Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() + " присущи следующие свойства: \n" + "Сила магии: "
                + gryffindor.getWitchcraftLevel() + "\n" + "Расстояние трансгрессии: " + gryffindor.getTransgressionDistance() + "\n" + "благородство: "
                + gryffindor.getNobilityLevel()+ "\n" + "честь: " + gryffindor.getHonourLevel() + "\n" +
                "храбрость: " + gryffindor.getBraveryLevel());
    }




}
