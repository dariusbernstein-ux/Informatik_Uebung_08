package h1;

public class Bruch {
    int zaehler;
    int nenner;
    Bruch (int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }
    private int ggT (int x, int y) {
        int r = 1;
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return x;
        }
    public void shorten() {
        int g = ggT(Math.abs(zaehler), Math.abs(nenner));
        zaehler /= g;
        nenner /= g;
    }
    public boolean hasSameValueAs(Bruch b) {
        return this.zaehler * b.nenner == this.nenner * b.zaehler;
    }

}
