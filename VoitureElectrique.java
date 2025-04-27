public class VoitureElectrique extends Voiture implements Electrique {

    public VoitureElectrique(String marque, int annee, int nbPortes) {
        super(marque, annee, nbPortes);
    }

    @Override
    public void recharger() {
        System.out.println("La voiture électrique " + marque + " est en train de se recharger.");
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture électrique " + marque + " démarre silencieusement.");
    }
}
