package métodos.sobrecarga;

public class Expoente {
    // Mais um método que não calcula nada
    public static void elevar() {
        System.out.println("Este metodo nao calcula nada!");
    }
    // Método que calcula o quadrado de i
    public static double elevar (double i) {
        return i * i;
    }
    
    // Método que calcula i elevado a j
    public static double elevar (double i, double j) {
        return Math.pow(i, j);
    }
}
