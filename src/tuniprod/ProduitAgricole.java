package tuniprod;

public class ProduitAgricole extends ProduitAliemntaire {

  String saison;
  String type;
  float quantite;

  public ProduitAgricole(String saison, String type, float quantite) {
    this.saison = saison;
    this.type = type;
    this.quantite = quantite;
  }

  public ProduitAgricole(int id, String libelle, String marque, String saison, String type, float quantite) {
    super(id, libelle, marque);
    this.saison = saison;
    this.type = type;
    this.quantite = quantite;
  }

  public ProduitAgricole(int id, String libelle, String marque, float prix, String saison, String type, float quantite) throws PrixNegatifExcep {
    super(id, libelle, marque, prix);
    this.saison = saison;
    this.type = type;
    this.quantite = quantite;
  }
}
