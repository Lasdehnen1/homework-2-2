public class Main {


    public static void main(String[] args) {


        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 100, 100, 100, 100, 100),
                new Gryffindor("Hermoine Granger", 85, 55, 68, 70, 30),
                new Gryffindor("Ron Weasley", 50, 60, 70, 80, 40)
        };

        Puffledui[] puffleduis = {
                new Puffledui("Zakharia Smith", 50, 80, 60, 30, 20),
                new Puffledui("Cedrick Diggory", 65, 40, 70, 50, 80),
                new Puffledui("Justin Finch-Fletchlie", 10, 20, 30, 40, 50)
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Cho Chang", 90, 80, 70, 60, 50, 40),
                new Kogtevran("Padma Patil", 60, 40, 50, 30, 70, 80),
                new Kogtevran("Marcus Belbie", 70, 70, 60, 60, 70, 70)
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100),
                new Slytherin("Graham Montague", 60, 70, 30, 20, 75, 60, 20),
                new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50)
        };

        puffleduis[0].compare(puffleduis[2]);
        System.out.println();
        System.out.println(slytherins[0].toString());
        System.out.println();
        kogtevrans[2].compare(gryffindors[0]);
        System.out.println();
        gryffindors[2].compare(gryffindors[0]);
    }

}