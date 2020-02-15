package pl.qc.ita.java.task4;

public class Pingwin extends IstotaZywa implements CanSwim{

    int dlugoscDzioba;

    public Pingwin(String imie, float waga, int dlugoscDzioba) {
        super(imie, waga);
        this.dlugoscDzioba=dlugoscDzioba;
    }

    public void wydajDzwiek() {
        System.out.println("łiii!");
    }

    @Override
    public void swim() {
        System.out.println("Ja pływam!!");
    }
}
