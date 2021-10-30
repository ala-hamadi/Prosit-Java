package tuniprod;

public class ProduitFruit extends  ProduitAgricole implements Critere{


  public ProduitFruit(String saison, String type, float quantite) {
    super(saison, type, quantite);
  }

  public ProduitFruit(int id, String libelle, String marque, String saison, String type, float quantite) {
    super(id, libelle, marque, saison, type, quantite);
  }

  public ProduitFruit(int id, String libelle, String marque, float prix, String saison, String type, float quantite) throws PrixNegatifExcep {
    super(id, libelle, marque, prix, saison, type, quantite);
  }

  @Override
  public boolean estFrais(String saison) {
    return saison==this.saison;
  }
}
