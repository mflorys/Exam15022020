package pl.qc.ita.java.task1;

public class Mezczyzna {
    private int wiek;
    private int wzrost;
    private Kobieta zona;

    public Mezczyzna(int wiek, int wzrost) {
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    public Mezczyzna(int wiek, int wzrost, Kobieta zona) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.zona = zona;
    }
}
