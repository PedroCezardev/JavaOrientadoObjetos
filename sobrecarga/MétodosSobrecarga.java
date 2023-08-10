package métodos.sobrecarga;

public class MétodosSobrecarga {

   
    public static void main(String[] args) {
        double a = 3;
        double b = 3.50;
        
        System.out.printf("O quadrado de %.2f e %.2f\n", a, Expoente.elevar(a));
        System.out.printf("%.2f elevado a %.2f e %.2f \n", a, b, Expoente.elevar(a,b));
        
        Expoente.elevar();
    }
    
}
