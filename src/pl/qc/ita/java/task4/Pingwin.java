package pl.qc.ita.java.task4;

public class Pingwin extends IstotaZywa implements CanSwim {

  int liczbaNog;

  public Pingwin(String imie, float waga, int liczbaNog) {
    super(imie, waga);
    this.liczbaNog = liczbaNog;
  }

  @Override
  public void wydajDzwiek() {
    System.out.println("łiii");
  }

  @Override
  public void swim() {
  }
}
