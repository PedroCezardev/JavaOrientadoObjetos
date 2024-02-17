public class Estudar {
    String tempo;
    String assunto;
    boolean exercitar;
    String comecar;
    String terminar;
    boolean pausar;
    boolean digitar;
    boolean pesquisar;
    String assistir;

    void status() {
        System.out.println("\nTempo: " + this.tempo);
        System.out.println("Assunto: " + this.assunto);
        System.out.println("Exercitar: " + this.exercitar);
        System.out.println("Começar: " + this.comecar);
        System.out.println("Terminar: " + this.terminar);
        System.out.println("Pausar: " + this.pausar);
        System.out.println("Digitar: " + this.digitar);
        System.out.println("Pesquisar: " + this.pesquisar);
        System.out.println("Assistir: " + this.assistir);
    }

    void pesquisar() {
        this.pesquisar = true;
    }

    void digitar() {
        this.digitar = true;
    }

    void pausar() {
        this.pausar = false;
    }

    void exercitar() {
        this.exercitar = true;
    }
}
