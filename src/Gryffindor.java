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
