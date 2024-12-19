public class Hangar {
    public static void main(String[] args) {
        Car Clio = new Car("Clio", 15000);
        Car C5 = new Car("C5", 275000);
        Boat Titanic = new Boat("Titanic", 2750);
        Boat Belem = new Boat("Belem", 2750);

        System.out.println(Clio.doStuff());
        System.out.println(C5.doStuff());
        System.out.println(Titanic.doStuff());
        System.out.println(Belem.doStuff());
    }
}