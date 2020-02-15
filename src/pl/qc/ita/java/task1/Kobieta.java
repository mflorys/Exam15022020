package pl.qc.ita.java.task1;

public class Kobieta {

  private int wiek;
  private double wzrost;
  private Mezczyzna maz;

  public void setMaz(Mezczyzna maz) {
    this.maz = maz;
  }

  public Kobieta(int wiek, double wzrost) {
    this.wiek = wiek;
    this.wzrost = wzrost;
  }

  Kobieta(int wiek, double wzrost, Mezczyzna mezczyzna) {
    this.wiek = wiek;
    this.wzrost = wzrost;
    this.maz = mezczyzna;
  }
}
