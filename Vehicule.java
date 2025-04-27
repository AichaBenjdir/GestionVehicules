public abstract class Vehicule {
    String marque;
    int annee;

    // Constructeur
    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }

    // Méthode abstraite
    public abstract void demarrer();

    // Méthode concrète pour afficher les informations du véhicule
    public void afficherInfos() {
        System.out.println("Marque: " + marque + ", Année: " + annee);
    }
}
