// Primeira aula de Programação Orientada a Objetos, exemplificando
// e introduzindo POO em Java. Exemplo da composição de uma caneta e complementando exemplos de classe que eu mesmo criei.

public class Main {
    public static void main(String[] args) {
        // Atribuindo atributos a classe caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.ponta = 0.5f; // referência a atributo
        c1.status(); // referência a métodos
        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c1.ponta = 0.9f;
        c2.destampar();
        c2.rabiscar();
        c2.status();

        // exercício de objeto feito por mim
        Celular cell = new Celular();
        cell.cor = "Preto";
        cell.tela();
        cell.modelo = "Galaxy a54";
        cell.bateria = "94%";
        cell.brilho = "24%";
        cell.volume = "44%";
        cell.senha = "000000";
        cell.formato = "Retangular";
        cell.ligar();
        cell.status();

        // classe abstrata
        Estudar est = new Estudar();
        est.tempo = "9 horas";
        est.assunto = "Programação Orientada a Objetos com Java.";
        est.comecar = "18 horas";
        est.terminar = "2 horas";
        est.assistir = "Vídeo aula youtube";
        est.pesquisar();
        est.exercitar();
        est.digitar();
        est.pausar();
        est.status();
    }
}