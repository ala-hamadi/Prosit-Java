package tuniprod;

public class Responsable extends Employe {

  float prime;

  public Responsable(int id, String nom, String adresse, int nbrHeures, float prime) {
    super(id, nom, adresse, nbrHeures);
    this.prime = prime;
  }

  @Override
  public String toString() {
    return "Responsable{" +
        super.toString()+
        ", prime=" + prime +
        '}';
  }

  @Override
  public float calculerSalaireEmploye() {
    float salaire = 0;
    float heuresSup = 0;
    float heuresBase = super.getNbrHeures();
    if (super.getNbrHeures() > 160) {
      heuresSup = super.getNbrHeures() - 160;
      heuresBase = 160;
    }
    salaire = (float) ((heuresBase * 10) + (12 * heuresSup));
    return salaire+prime;
  }
}
