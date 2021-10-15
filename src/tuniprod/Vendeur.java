package tuniprod;

public class Vendeur extends Employe{
  float tauxDeVente;


  public Vendeur(int id, String nom, String adresse, int nbrHeures,float tauxDeVente) {
    super(id, nom, adresse, nbrHeures);
    this.tauxDeVente=tauxDeVente;
  }
}
