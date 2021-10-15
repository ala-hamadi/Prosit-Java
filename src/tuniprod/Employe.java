package tuniprod;

public class Employe {

  protected int id;
  protected String nom;
  protected String adresse;
  protected float nbrHeures;

  public Employe(int id, String nom, String adresse, float nbrHeures) {
    this.id = id;
    this.nom = nom;
    this.adresse = adresse;
    this.nbrHeures = nbrHeures;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public float getNbrHeures() {
    return nbrHeures;
  }

  public void setNbrHeures(float nbrHeures) {
    this.nbrHeures = nbrHeures;
  }

  @Override
  public String toString() {
    return "Employe{" +
        "id=" + id +
        ", nom='" + nom + '\'' +
        ", adresse='" + adresse + '\'' +
        ", nbrHeures=" + nbrHeures +
        '}';
  }
}
