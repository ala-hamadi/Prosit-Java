package tuniprod;

public class Caissier extends Employe{
  int numeroDeCaisse;


  public Caissier(int id, String nom, String adresse, int nbrHeures,int numeroDeCaisse) {
    super(id, nom, adresse, nbrHeures);
    this.numeroDeCaisse=numeroDeCaisse;
  }

  @Override
  public String toString() {
    return "Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}' + super.toString();
  }

  public float calculerSalaireEmploye() {
    float salaire = 0;
    float heuresSup = 0;
    float heuresBase = super.getNbrHeures();
    if (super.getNbrHeures() > 180) {
      heuresSup = super.getNbrHeures() - 180;
      heuresBase = 180;
    }
    salaire = (float) ((heuresBase * 5) + (5.75* heuresSup));
    return salaire;
  }
}
