import java.util.ArrayList;

class Voiture {
    private Couleur couleur;
    private Moteur moteur;
    private Transmission transmission;
    private ArrayList<String> options = new ArrayList<>();

    private Voiture(BuilderVoiture builder) {
        this.couleur = builder.couleur;
        this.moteur = builder.moteur;
        this.transmission = builder.transmission;
        this.options = builder.options;
    }

    @Override
    public String toString() {
        return "Voiture {" +
                "couleur=" + couleur +
                ", moteur=" + moteur +
                ", transmission=" + transmission +
                ", options=" + options +
                '}';
    }

    // Builder pour la classe Voiture
    public static class BuilderVoiture {
        private Couleur couleur;
        private Moteur moteur;
        private Transmission transmission;
        private ArrayList<String> options = new ArrayList<>();

        public BuilderVoiture definirCouleur(Couleur couleur) {
            this.couleur = couleur;
            return this;
        }

        public BuilderVoiture definirMoteur(Moteur moteur) {
            this.moteur = moteur;
            return this;
        }

        public BuilderVoiture definirTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public BuilderVoiture ajouterOption(String option) {
            this.options.add(option);
            return this;
        }

        public Voiture construire() {
            return new Voiture(this);
        }
    }
}