package pl.qc.ita.java.task4;

public class Kaczka extends IstotaZywa {

    int liczbaSkrzydel;

    public Kaczka(String imie, float waga, int liczbaSkrzydel) {
        super(imie, waga);
        this.liczbaSkrzydel = liczbaSkrzydel;
    }
    public void wydajDzwiek(){
        System.out.println("KwaKwa");
    }
}
