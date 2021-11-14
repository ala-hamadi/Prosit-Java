package setinterfaceandcollections;

import listinterfaceandcollections.Etudiant;

public class Enseignant {
  private int id;
  private String nom;
  private String prenom;

  public Enseignant() {
  }
  public Enseignant(int id, String nom, String prenom) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
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

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null||!(this instanceof Enseignant)) {
      return false;
    }
    Enseignant enseignant = (Enseignant) o;
    return id == enseignant.id;
  }

  @Override
  public String toString() {
    return "Enseignant{" +
        "id=" + id +
        ", nom='" + nom + '\'' +
        ", prenom='" + prenom + '\'' +
        '}';
  }
}
