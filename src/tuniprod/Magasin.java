/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuniprod;

/**
 * @author Ala Hamadi
 */
public class Magasin {

  private int id;
  private String adresse;
  private int capacite;
  private Produit[] produits;
  private int nbEmplyes;

  private Employe[] employes;

  public Magasin() {
  }

  public Magasin(int id, String adresse) {
    this.id = id;
    this.adresse = adresse;
    this.capacite = 0;
    this.produits = new Produit[50];
    this.nbEmplyes=0;
    this.employes = new Employe[20];
  }




  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < this.capacite; i++) {
      str += produits[i];
    }
    String str2="";
    for (int i = 0; i < this.nbEmplyes; i++) {
      str2 += employes[i];
    }
    return "id= " + this.id + " adresse= " + this.adresse + " capacite= " + this.capacite + " " + str+" "+str2;
  }

  public void ajouterProduit(Produit p) {
    if (!isHere(p)) {
      produits[capacite] = p;
      this.capacite++;
    }
  }

  public void afficherNombreTotal() {
    System.out.println(this.capacite);
  }

//  public void comparer(Produit p1, Produit p2) {
//    if (p1.id == p2.id && p1.libelle == p2.libelle && p1.prix == p2.prix) {
//      System.out.println("les deux produits sont identiques");
//    } else {
//      System.out.println("Nah");
//    }
//  }

  public boolean comparer(Produit p1, Produit p2) {
    return p1.getId() == p2.getId() && p1.getLibelle() == p2.getLibelle() && p1.getPrix()==p2.getPrix();
  }

  public boolean isHere(Produit p) {
    for (int i = 0; i < this.capacite; i++) {
      if (p.comparer(this.produits[i])) {
        return true;
      }
    }
    return false;
  }

//  public void supprimerProduit(Produit p) {
//    Produit[] newProduit = new Produit[50];
//    int newCap=0;
//    for (int i = 0; i < this.capacite; i++) {
//      if(!p.comparer(this.produits[i])){
//        newProduit[newCap]=this.produits[i];
//        newCap++;
//      }
//    }
//    this.produits=newProduit;
//    this.capacite=newCap;
//
//  }
    public void supprimerProduit(Produit p) {
    if(this.capacite==50&&p.comparer(this.produits[49])){
      this.produits[49]=null;
    }
      for (int i = 0; i < this.capacite; i++) {
        if (p.comparer(this.produits[i])) {
          this.produits[i]=this.produits[i+1];
        }
      }

    }


  public Magasin magasinSupProduit(Magasin m){
    if (m.capacite>this.capacite)
      return m;
    else
      return this;
  }


  public void ajouterEmployer(Employe E) {
      employes[nbEmplyes] = E;
      this.nbEmplyes++;
  }

}
