package pl.qc.ita.java.task4;

public class Slimak extends IstotaZywa implements CanRun {

    int szybkoscBiegania;

    public Slimak(String imie, float waga, int szybkoscBiegania) {
        super(imie, waga);
        this.szybkoscBiegania = szybkoscBiegania;
    }

    public void wydajDzwiek() {
        System.out.println("aaaaajee!");
    }

    @Override
    public void run() {
        System.out.println("Ja biegam!!");
    }
}
