public class Camion extends Vehicule {
    int capaciteCharge;

    public Camion(String marque, int annee, int capaciteCharge) {
        super(marque, annee);
        this.capaciteCharge = capaciteCharge;
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion " + marque + " démarre avec un moteur diesel.");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Capacité de charge : " + capaciteCharge + " kg");
    }
}
