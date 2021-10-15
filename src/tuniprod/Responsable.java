package tuniprod;

public class Responsable extends Employe{
  float prime;

  public Responsable(int id, String nom, String adresse, int nbrHeures,float prime) {
    super(id, nom, adresse, nbrHeures);
    this.prime=prime;
  }
}
