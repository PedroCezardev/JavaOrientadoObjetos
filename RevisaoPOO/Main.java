/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

                PessoaRepository repositorio = new PessoaRepository();

                // Exemplo de inserção de pessoas no repositório
                Pessoa pessoa1 = new Pessoa(1,"pedro");
                Pessoa pessoa2 = new Pessoa(2,"marcus");
                repositorio.inserirPessoa(pessoa1);
                repositorio.inserirPessoa(pessoa2);

                try {
                    // Exemplo de busca de pessoa pelo ID
                    Pessoa pessoaEncontrada = repositorio.pegarPessoaPelaId(1);
                    System.out.println("Pessoa encontrada: " + pessoaEncontrada.getNome());
                } catch (PessoaNaoEncontradaExeception e) {
                    System.out.println(e.getMessage());
                }

    }
}