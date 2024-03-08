public class Main {
    public static void main(String[] args) {

        House house = new House("ULAN-2");
        Son son = new Son(15,"Dafe","BMW",Hebits.LAZY, house, "Marketolog", "Harvard");

        System.out.println(son.getInfo());
        son.makeVoice();
        son.makeVoice("Goodbye World!");

        System.out.println();

        House house1 = new House("KOK JAR");
        Dad dad = new Dad(45,"Mark","Tesla",Hebits.SOCIABLE, house1, "Polise");

        System.out.println(dad.getInfo());
        dad.makeVoice();
        dad.makeVoice("I am sociable!");

        System.out.println();

        House house2 = new House("AK ORDO 3");
        Dad dad2 = new Dad(36,"Alan","TOYOTA CANRY 75",Hebits.BORING,house2,"DOCTOR");

        System.out.println(dad2.getInfo());
        dad2.makeVoice();
        dad2.makeVoice("I am very boring person!");

    }
}