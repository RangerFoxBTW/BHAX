class Szulo{

    void message() {
        System.out.println("Szülő üzenete.");
    }
}

class Gyerek extends Szulo{

    void message2() {
        System.out.println("Gyerek üzenete");
    }
}

class Family{
    public static void main(String[] args) {

        Szulo szulo = new Szulo();
        Szulo gyerek = new Gyerek();

        szulo.message();
        gyerek.message2();      

    }
}