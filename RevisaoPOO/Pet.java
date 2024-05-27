public abstract class Pet implements ComportamentoAnimal{
    private int id;
    private String nome;
    private Pessoa dono;

    public Pet(int id, String nome, Pessoa dono){
        this.id = id;
        this.nome = nome;
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
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
