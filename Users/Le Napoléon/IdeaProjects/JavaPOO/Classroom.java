public class Classroom {
    public static void main(String[] args) {
        Wilder Topper = new Wilder("Riri", true);
        Wilder Fernand = new Wilder("Fifi", false);
        Wilder Arthur = new Wilder("Loulou", false);

        System.out.println(Topper.whoAmI());
        System.out.println(Fernand.whoAmI());
        System.out.println(Arthur.whoAmI());
    }
}
