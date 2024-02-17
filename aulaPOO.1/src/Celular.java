public class Celular {
    String cor;
    boolean ligado;
    String modelo;
    String bateria;
    String brilho;
    String volume;
    String senha;
    String formato;

    void status() {
        System.out.println("cor: " + this.cor);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Brilho: " + this.brilho);
        System.out.println("Tela: " + this.ligado);
        System.out.println("Volume: " + this.volume);
        System.out.println("Senha: " + this.senha);
        System.out.println("Formato: " + this.formato);
    }

    void tela() {
        if (this.ligado == false) {
            System.out.println("\nTela do Celular ligada.");
        } else {
            System.out.println("\nTela do celular desligada. O celular está desligado.");
        }
    }

    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

}
