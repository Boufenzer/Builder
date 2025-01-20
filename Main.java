public class Main {
    public static void main(String[] args) {
        // Construire des voitures prédéfinies
        Voiture voitureSport = VoitureDirector.VoitureSport();
        Voiture voitureFamiliale = VoitureDirector.VoitureFamiliale();

        // Construire une voiture personnalisée
        Voiture voiturePersonnalisee = new Voiture.BuilderVoiture().definirCouleur(Couleur.NOIR).definirMoteur(Moteur.ELECTRIQUE).definirTransmission(Transmission.MANUELLE).ajouterOption("Caméra de recul").construire();

        // Afficher les voitures
        System.out.println(voitureSport);
        System.out.println(voitureFamiliale);
        System.out.println(voiturePersonnalisee);
    }
}