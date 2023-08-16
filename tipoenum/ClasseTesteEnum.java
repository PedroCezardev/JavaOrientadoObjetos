// Onde digitamos a função do Objeto:

package com.mycompany.tipoenum;

public class ClasseTesteEnum {
    EnumPlanetas planeta;
    
    ClasseTesteEnum(String planeta){
        this.planeta = EnumPlanetas.valueOf(planeta);
        // O conteúdo do parâmetro "planeta" vai ser gravado na numeração "this.planeta"
        // Ultilizamos o método valueOf (que é específico das enumerações) para convertar o valor de String para uma Enumeração. E aí conseguimos armazenar os dados String na Enumeração 'planeta'.
    }
    
    public void viajarPlaneta() {
        switch(planeta) {
            case MERCURIO:
                System.out.println("Muito quente por lá!");
                break;
            case TERRA:
                System.out.println("Já estamos aqui!");
                break;
            case URANO:
                System.out.println("Muito longe!");
                break;
            case MARTE:
                System.out.println("Boa viagem ao Planeta vermelho!");
                break;
            case JUPITER:
                System.out.println("Boa viagem a órbita do Gigante Planeta Gasoso!");
                break;
            default:
                System.out.println("Passagens esgotadas!");
                break;
        }
    }
}
