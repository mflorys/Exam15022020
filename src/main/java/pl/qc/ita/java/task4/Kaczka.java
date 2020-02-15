package pl.qc.ita.java.task4;

public class Kaczka extends IstotaZywa implements CanFly {

    int liczbaSkrzydel;

    public Kaczka(String imie, float waga, int liczbaSkrzydel) {
        super(imie, waga);
        this.liczbaSkrzydel = liczbaSkrzydel;
    }

    public void wydajDzwiek() {
        System.out.println("Kwakwa!");
    }

    @Override
    public void fly() {
        System.out.println("Ja latam!!!");
    }
}
