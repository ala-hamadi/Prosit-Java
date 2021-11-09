/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinterfaceandcollections;


public class Main {

  public static void main(String[] args) {
    Etudiant e = new Etudiant();
    Etudiant e1 = new Etudiant(1, "A.L.A", "B");
    Etudiant e2 = new Etudiant(4, "A", "B");
    Etudiant e3 = new Etudiant(3, "B", "B");

    System.out.println(e1.toString());
    if (e1.equals(e2)) {
      System.out.println("equals");
    } else {
      System.out.println("not equals");
    }

    EspritArrayList espritArrayList = new EspritArrayList();
    espritArrayList.ajouterEtudiant(e1);
    espritArrayList.ajouterEtudiant(e2);
    espritArrayList.ajouterEtudiant(e3);
    espritArrayList.displayEtudiants();
    System.out.println("*********************");
    espritArrayList.supprimerEtudiant(e1);
    espritArrayList.displayEtudiants();
    System.out.println("*********************");

    if (espritArrayList.rechercherEtudiant(e1)) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    if (espritArrayList.rechercherEtudiant(e2)) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    System.out.println("*********************");
    if (espritArrayList.rechercherEtudiant("A.L.A")) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    if (espritArrayList.rechercherEtudiant("A")) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    System.out.println("*********************");

    espritArrayList.trierEtudiantsParId();
    espritArrayList.displayEtudiants();
    System.out.println("*********************");
    espritArrayList.trierEtudiantsParNom();
    espritArrayList.displayEtudiants();

  }

}
