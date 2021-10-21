package tuniprod;

public class ProduitLegume extends ProduitAgricole implements Critere{


  public ProduitLegume(String saison, String type, float quantite) {
    super(saison, type, quantite);
  }

  public ProduitLegume(int id, String libelle, String marque, String saison, String type, float quantite) {
    super(id, libelle, marque, saison, type, quantite);
  }

  public ProduitLegume(int id, String libelle, String marque, float prix, String saison, String type, float quantite) {
    super(id, libelle, marque, prix, saison, type, quantite);
  }


  @Override
  public boolean estFrais(String saison) {
        String[] mois = {"jan", "fev", "mars", "avr", "mai", "juin", "juill", "aout", "sept","oct","nov","dec"};
        int j = 0;
        for (int i = 0; i < mois.length - 1; i++) {
          if (mois[i].equals(this.saison)) {
            j = i;
            break;
          }
        }
        if (saison.equals(mois[j]) || saison.equals(mois[j + 1])) {
          return true;
        }
        return false;
    }
}
