package setinterfaceandcollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import listinterfaceandcollections.Etudiant;

public class EspritHashSet implements  GestionEnseignant{

  Set<Enseignant> enseignantSet = new HashSet();


  @Override
  public void ajouterEnseignant(Enseignant e) {
    enseignantSet.add(e);
  }

  @Override
  public boolean rechercherEnseignant(Enseignant e) {
    return this.enseignantSet.contains(e);
  }

  @Override
  public boolean rechercherEnseignant(int id) {
    for (Enseignant e:enseignantSet) {
      if(e.getId()==id){
        return true;
      }
    }
    return false;
  }

  @Override
  public void supprimerEnseignant(Enseignant e) {
    this.enseignantSet.remove(e);
  }

  @Override
  public void displayEnseignants() {
    for (Enseignant enseignant:enseignantSet) {
      System.out.println(enseignant);
    }
  }
}
