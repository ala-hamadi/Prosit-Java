package tuniprod;

public class Vendeur extends Employe{
  float tauxDeVente;


  public Vendeur(int id, String nom, String adresse, int nbrHeures,float tauxDeVente) {
    super(id, nom, adresse, nbrHeures);
    this.tauxDeVente=tauxDeVente;
  }

  @Override
  public String toString() {
    return "Responsable{" +
        super.toString()+
        ", tauxDeVente=" + tauxDeVente +
        '}';
  }

  public float calculerSalaireEmploye() {
    float salaire = 0;
    salaire = 450 * (tauxDeVente / 100);
    return salaire;
  }
}
