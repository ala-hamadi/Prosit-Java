package setinterfaceandcollections;

public class Main {

  public static void main(String[] args) {
    Enseignant e1 = new Enseignant(1, "A.L.A", "B");
    Enseignant e2 = new Enseignant(4, "A", "B");
    Enseignant e3 = new Enseignant(3, "B", "B");

    System.out.println(e1.toString());
    if (e1.equals(e2)) {
      System.out.println("equals");
    } else {
      System.out.println("not equals");
    }

    EspritHashSet espritHashSet = new EspritHashSet();
    espritHashSet.ajouterEnseignant(e1);
    espritHashSet.ajouterEnseignant(e2);
    espritHashSet.ajouterEnseignant(e3);
    espritHashSet.displayEnseignants();
    System.out.println("*********************");
    espritHashSet.supprimerEnseignant(e1);
    espritHashSet.displayEnseignants();
    System.out.println("*********************");

    if (espritHashSet.rechercherEnseignant(e1)) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    if (espritHashSet.rechercherEnseignant(e2)) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    System.out.println("*********************");
    if (espritHashSet.rechercherEnseignant(1)) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    if (espritHashSet.rechercherEnseignant(2)) {
      System.out.println("Mawjoud");
    } else {
      System.out.println("No");
    }
    System.out.println("*********************");

    espritHashSet.displayEnseignants();

  }
}
