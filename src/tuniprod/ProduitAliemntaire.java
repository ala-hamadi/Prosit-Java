package tuniprod;

public class ProduitAliemntaire extends Produit {


  public ProduitAliemntaire() {
  }

  public ProduitAliemntaire(int id, String libelle, String marque) {
    super(id, libelle, marque);
  }

  public ProduitAliemntaire(int id, String libelle, String marque, float prix) throws PrixNegatifExcep {
    super(id, libelle, marque, prix);
  }



}
