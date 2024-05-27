import java.util.ArrayList;

public class PessoaRepository extends Pessoa{
    private ArrayList<Pessoa> Pessoas;

    public PessoaRepository(int id, String nome, ArrayList<Pessoa> Pessoas) {
        super(id, nome);
        this.Pessoas = Pessoas;
    }

    public void inserirPessoa(Pessoa p) {
        Pessoas.add(p);
    }
    public Pessoa pegarPessoaPelaId(int id ) throws PessoaNaoEncontradaExeception {
        for( int i = 0; i < Pessoas.size(); i++){
            if (Pessoas.get(i).getId() == id) {
                return this.Pessoas.get(i);
            } 
        }
        throw new PessoaNaoEncontradaExeception("Pessoa não encontrada com ID fornecido: " + id);
    }
}
