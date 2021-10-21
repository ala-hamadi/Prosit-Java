package tuniprod;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Ala Hamadi
 */
public class Main {

  public static void main(String[] args) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    Produit p0 = new Produit();
    Produit p1 = new Produit(1021, "lait", "Delice");
    Produit p2 = new Produit(2510, "yaourt", "Vitalait");
    Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.2f);
    p0.afficher();
    p1.afficher();
    p2.afficher();
    p3.afficher();
    p1.prix = 0.7f;
    p1.afficher();
    p0.id = 0;
    p0.libelle = "tomate";
    p0.marque = "Cap";
    p0.prix = 1.3f;
    p0.afficher();
    p2.prix = 0.4f;
    System.out.println(p0.toString());
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    p0.dateExpiration = dateFormat.parse("01/09/2021");
    p1.dateExpiration = dateFormat.parse("02/09/2021");
    p2.dateExpiration = dateFormat.parse("03/09/2021");
    p3.dateExpiration = dateFormat.parse("04/09/2021");

    Magasin mg = new Magasin(1, "Nabeul");
    mg.ajouterProduit(p3);
    mg.ajouterProduit(p2);
    System.out.println(mg);
    mg.afficherNombreTotal();

    mg.comparer(p1, p2);

    Magasin mg11 = new Magasin(1, "Nabeul");
    Magasin mg12 = new Magasin(12, "Tunis");

    Caissier c11 = new Caissier(1, "foulen1", "adresse1", 30, 5);
    Caissier c12 = new Caissier(2, "foulen2", "adresse2", 31, 6);
    Vendeur v11 = new Vendeur(3, "foulen3", "adresse3", 32, (float) 66.2);
    Responsable r11 = new Responsable(4, "foulen4", "adresse4", 180, (float) 66.2);
    System.out.println("Salaire " + c11.getNom() + " :" + c11.calculerSalaireEmploye());
    System.out.println("Salaire " + c12.getNom() + " :" + c12.calculerSalaireEmploye());
    System.out.println("Salaire " + v11.getNom() + " :" + v11.calculerSalaireEmploye());
    System.out.println("Salaire " + r11.getNom() + " :" + r11.calculerSalaireEmploye());

    mg11.ajouterEmployer(c11);
    mg11.ajouterEmployer(c12);
    mg11.ajouterEmployer(v11);
    mg11.ajouterEmployer(r11);
    mg11.ajouterProduit(p1);
    mg11.ajouterProduit(p2);

    Caissier c21 = new Caissier(5, "foulen5", "adresse5", 33, 2);
    Vendeur v21 = new Vendeur(6, "foulen6", "adresse6", 36, (float) 68.2);
    Vendeur v22 = new Vendeur(7, "foulen7", "adresse7", 37, (float) 69.2);
    Vendeur v23 = new Vendeur(8, "foulen8", "adresse8", 38, (float) 60.2);
    Responsable r21 = new Responsable(9, "foulen9", "adresse9", 39, (float) 66.2);
    System.out.println("Salaire " + c21.getNom() + " :" + c21.calculerSalaireEmploye());
    System.out.println("Salaire " + v21.getNom() + " :" + v21.calculerSalaireEmploye());
    System.out.println("Salaire " + v22.getNom() + " :" + v22.calculerSalaireEmploye());
    System.out.println("Salaire " + v23.getNom() + " :" + v23.calculerSalaireEmploye());
    System.out.println("Salaire " + r21.getNom() + " :" + r21.calculerSalaireEmploye());

    mg12.ajouterEmployer(c21);
    mg12.ajouterEmployer(v21);
    mg12.ajouterEmployer(v22);
    mg12.ajouterEmployer(v23);
    mg12.ajouterEmployer(r21);
    mg12.ajouterProduit(p2);

    System.out.println(mg11);
    System.out.println(mg12);

    ProduitFruit pf1 = new ProduitFruit(12,"Fraise","marque","Mars","Fruit",45);
    ProduitFruit pf2 = new ProduitFruit(13,"Pastèque ","marque","Mars","Fruit",45);
    ProduitFruit pf3 = new ProduitFruit(14,"Fraise","marque","Mars","Fruit",45);
    ProduitFruit pl1 = new ProduitFruit(15,"Artichauts ","marque","Mars","Legumes",44);

    mg11.ajouterProduit(pf1);
    mg11.ajouterProduit(pf2);
    mg11.ajouterProduit(pf3);
    mg11.ajouterProduit(pl1);


  }

}
