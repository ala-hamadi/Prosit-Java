package tuniprod;

import java.util.Date;

/**
 * @author Ala Hamadi
 */
public class Produit {

  int id;
  String libelle;
  String marque;
  float prix;
  Date dateExpiration;

  public Produit() {
  }

  public Produit(int id, String libelle, String marque) {
    this.id = id;
    this.libelle = libelle;
    this.marque = marque;
  }

  public Produit(int id, String libelle, String marque, float prix) {
    this.id = id;
    this.libelle = libelle;
    this.marque = marque;
    if (prix >= 0) {
      this.prix = prix;
    }
  }
    
    /*public Produit (int id,String libelle,String marque,Date dateExpiration){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.dateExpiration=dateExpiration;
    }*/

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public float getPrix() {
    return prix;
  }

  public void setPrix(float prix) {
    if (prix >= 0) {
      this.prix = prix;
    }
  }

  public Date getDateExpiration() {
    return dateExpiration;
  }

  public void setDateExpiration(Date dateExpiration) {
    this.dateExpiration = dateExpiration;
  }


  public void afficher() {
    System.out.println("id= " + this.id + " libelle= " + this.libelle + " marque= " + this.marque + " prix= " + this.prix);
  }

  @Override
  public String toString() {
    return "id= " + this.id + " libelle= " + this.libelle + " marque= " + this.marque + " prix= " + this.prix;
  }

  public boolean comparer(Produit p) {
    //    if (p.id == this.id && p.libelle == this.libelle && p.prix == this.prix) {
    //      return true;
    //    }
    //    return false;
    return p.getId() == this.id && p.getLibelle() == this.libelle && p.getPrix() == this.prix;
  }

  public static boolean comparer(Produit p1, Produit p2) {
    return p1.getId() == p2.getId() && p1.getLibelle() == p2.getLibelle() && p1.getPrix()==p2.getPrix();
  }

}
    
     