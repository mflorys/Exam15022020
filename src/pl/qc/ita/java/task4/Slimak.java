package pl.qc.ita.java.task4;

public class Slimak extends IstotaZywa implements CanRun {

  boolean czyJestDomek;

  public Slimak(String imie, float waga, boolean czyJestDomek) {
    super(imie, waga);
    this.czyJestDomek = czyJestDomek;
  }

  @Override
  public void wydajDzwiek() {
    System.out.println("aaaaajee");
  }

  @Override
  public void run() {

  }
}
