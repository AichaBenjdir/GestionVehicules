public class Moto extends Vehicule {
    boolean estElectrique;

    public Moto(String marque, int annee, boolean estElectrique) {
        super(marque, annee);
        this.estElectrique = estElectrique;
    }

    @Override
    public void demarrer() {
        if (estElectrique) {
            System.out.println("La moto électrique " + marque + " démarre silencieusement.");
        } else {
            System.out.println("La moto " + marque + " démarre avec un moteur à essence.");
        }
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Moto électrique : " + (estElectrique ? "Oui" : "Non"));
    }
}
