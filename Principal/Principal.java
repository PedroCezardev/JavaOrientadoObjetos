 package Principal;

public class Principal {
    
    public static void main(String[] args) {
        EstudandoClasse livro = new EstudandoClasse();
        
        livro.nome = "Bóson Linux";
        livro.descricao = "Livro sobre Linux da Bóson!";
        livro.isbn = "978671186617";
        livro.preco = 45.95;
        livro.autor = "Fábio dos Reis";
        livro.dataPub = "20/04/2017";
        
        livro.dadosLivro();
    }
}
