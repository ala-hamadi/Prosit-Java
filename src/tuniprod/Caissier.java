package tuniprod;

public class Caissier extends Employe{
  int numeroDeCaisse;


  public Caissier(int id, String nom, String adresse, int nbrHeures,int numeroDeCaisse) {
    super(id, nom, adresse, nbrHeures);
    this.numeroDeCaisse=numeroDeCaisse;
  }
}
