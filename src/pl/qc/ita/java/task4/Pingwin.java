package pl.qc.ita.java.task4;

public class Pingwin extends IstotaZywa {

    int liczbaSkrzydel;

    public Pingwin(String imie, float waga, int liczbaSkrzydel) {
        super(imie, waga);
        this.liczbaSkrzydel = liczbaSkrzydel;
    }
    public void wydajDzwiek(){
        System.out.println("łiiii");
    }
}
