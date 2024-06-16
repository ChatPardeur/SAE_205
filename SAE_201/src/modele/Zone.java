package modele;

import java.util.ArrayList;
import java.util.Iterator;

public class Zone {
    private String nom;
    private int nbColumn;
    private int nbLignes;
    private ArrayList<Fauteuil> fauteuils;

    public Zone(String nom) {
        this.nom = nom;
        this.fauteuils = new ArrayList<>();
        this.fauteuils.add(new Fauteuil("a", "1"));
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public int getNbColumn() {
        return nbColumn;
    }

    public void setNbColumn(int nbColumn) {
        this.nbColumn = nbColumn;
    }

    
    public int getNbLignes() {
        return nbLignes;
    }

    public void setNbLignes(int nbLignes) {
        this.nbLignes = nbLignes;
    }

    
    public int getNbSieges() {
        return fauteuils.size();
    }

    public boolean contientFauteuil(Fauteuil f) {
        return fauteuils.contains(f);
    }

    private void ajouteF(Fauteuil f) {
        fauteuils.add(f);
    }

    public String ajouteFauteuil(Fauteuil f) {
        if (contientFauteuil(f)) {
            return "erreur : le fauteuil est déjà ajouté";
        } else {
            ajouteF(f);
            return "opération effectuée";
        }
    }

    private void enleverF(Fauteuil f) {
        fauteuils.remove(f);
    }

    public String enleverFauteuil(Fauteuil f) {
        if (fauteuils.size() == 1) {
            return "erreur : impossible d'enlever le dernier fauteuil";
        } else if (!contientFauteuil(f)) {
            return "erreur : fauteuil non trouvé";
        } else {
            enleverF(f);
            return "opération effectuée";
        }
    }

    public void listerFauteuils() {
        Iterator<Fauteuil> it = fauteuils.iterator();
        while (it.hasNext()) {
            it.next().afficher();
        }
    }

    public boolean ajouterFauteuils(int nbLignes, int nbColumn) {
        if (nbLignes > 25) {
            System.out.println("erreur : il ne peut pas y avoir plus de 25 rangées");
            return false;
        } else {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            enleverF(fauteuils.get(0));
            for (int ligne = 0; ligne < nbLignes; ligne++) {
                for (int colonne = 1; colonne < nbColumn + 1; colonne++) {
                    ajouteF(new Fauteuil(Character.toString(alphabet.toCharArray()[ligne]), Integer.toString(colonne)));
                }
            }
            this.nbLignes = nbLignes;  
            this.nbColumn = nbColumn;  
            return true;
        }
    }

    public static Zone creerZone(String nom, int nbLignes, int nbColumn) {
        if (nom.matches("[a-zA-Z]+")) {
            Zone zone = new Zone(nom);
            if (zone.ajouterFauteuils(nbLignes, nbColumn)) {
                return zone;
            } else {
                System.out.println("erreur : les fauteuils n'ont pas pu être ajoutés");
                return null;
            }
        } else {
            System.out.println("erreur : le nom doit contenir uniquement des caractères alphabétiques");
            return null;
        }
    }

    public static void main(String[] args) {
        Zone z = new Zone("test");
        z.ajouterFauteuils(10, 10);
        z.listerFauteuils();
    }
}
