public class Cachorro extends Pet {
    private String raca;

    public Cachorro(String raca, int id, String nome, Pessoa dono) {
        super(id, nome, dono);
        this.raca = raca;
    }

    // Getters and setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }

    @Override
    public void obedecerComandos(String comando) {
        System.out.println("Obedecendo comando: " + comando);
    }
}
