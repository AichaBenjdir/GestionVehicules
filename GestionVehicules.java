import java.util.ArrayList;

public class GestionVehicules {
    public static void main(String[] args) {
        // Instanciation des objets
        Vehicule voiture = new Voiture("Toyota", 2020, 4);
        Vehicule camion = new Camion("Volvo", 2018, 12000);
        Vehicule moto = new Moto("Yamaha", 2021, false);
        Vehicule voitureElectrique = new VoitureElectrique("Tesla", 2022, 4);

        // Liste d'objets Vehicule
        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(voiture);
        vehicules.add(camion);
        vehicules.add(moto);
        vehicules.add(voitureElectrique);

        // Parcours de la liste et appel de la méthode demarrer pour chaque véhicule
        for (Vehicule v : vehicules) {
            v.demarrer();  // Polymorphisme
            v.afficherInfos();
            if (v instanceof Electrique) {
                ((Electrique) v).recharger();  // Appel de la méthode spécifique aux véhicules électriques
            }
            System.out.println();
        }
    }
}
