public class Main {
    public static void main(String[] args) {
        
        Voiture voitureSport = VoitureDirector.VoitureSport();
        Voiture voitureFamiliale = VoitureDirector.VoitureFamiliale();

       
        Voiture voiturePersonnalisee = new Voiture.BuilderVoiture().definirCouleur(Couleur.NOIR).definirMoteur(Moteur.ELECTRIQUE).definirTransmission(Transmission.MANUELLE).ajouterOption("Caméra de recul").construire();

       
        System.out.println(voitureSport);
        System.out.println(voitureFamiliale);
        System.out.println(voiturePersonnalisee);
    }
}
