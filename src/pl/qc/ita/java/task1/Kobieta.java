package pl.qc.ita.java.task1;

public class Kobieta {

  private int wiek;
  private int wzrost;
  private Mezczyzna maz;

  public Mezczyzna getMaz() {
    return maz;
  }

  public Kobieta(int wiek, int wzrost) {
    this.wiek = wiek;
    this.wzrost = wzrost;
  }

  public Kobieta(int wiek, int wzrost, Mezczyzna maz) {
    this.wiek = wiek;
    this.wzrost = wzrost;
    this.maz = maz;
  }
}
