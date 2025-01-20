class VoitureDirector {
    public static Voiture VoitureSport() {
        return new Voiture.BuilderVoiture()
                .definirCouleur(Couleur.ROUGE)
                .definirMoteur(Moteur.ESSENCE)
                .definirTransmission(Transmission.AUTOMATIQUE)
                .ajouterOption("Sièges sport")
                .ajouterOption("Finition sport")
                .construire();
    }

    public static Voiture VoitureFamiliale() {
        return new Voiture.BuilderVoiture()
                .definirCouleur(Couleur.BLEU)
                .definirMoteur(Moteur.HYBRIDE)
                .definirTransmission(Transmission.AUTOMATIQUE)
                .ajouterOption("Sièges enfant")
                .ajouterOption("Toit ouvrant")
                .construire();
    }
}
