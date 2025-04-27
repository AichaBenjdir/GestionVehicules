public class Voiture extends Vehicule {
    int nbPortes;

    public Voiture(String marque, int annee, int nbPortes) {
        super(marque, annee);
        this.nbPortes = nbPortes;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture " + marque + " démarre avec un moteur à combustion.");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de portes : " + nbPortes);
    }
}
