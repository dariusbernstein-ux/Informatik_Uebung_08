package h1;

public class H1_main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(70, 5);
        System.out.println("Vor dem Kürzen: " + b1.zaehler + "/" + b1.nenner);
        b1.shorten();
        System.out.println("Nach dem Kürzen: " + b1.zaehler + "/" + b1.nenner);

    }
}
