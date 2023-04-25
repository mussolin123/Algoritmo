import java.util.Scanner;

public class Regiao {
    
    public static void main (String []args){

        String sigla;

        Scanner entrada;
                
        entrada = new Scanner(System.in);
        System.out.println("Insira uma das siglas - PR, RS ou SC: ");
        sigla = entrada.next();
        entrada.close();

        switch(sigla){
            case "PR":
            System.out.printf("A Sigla PR refere-se ao Estado do Paraná, Código 41, e região SUL\n");
            break;

                case "SC":
                System.out.printf("A Sigla SC refere-se ao Estado de Santa Catarina, Código 42, e região SUL\n");
                break;

                    case "RS":
                    System.out.printf("A Sigla RS refere-se ao Estado do Rio Grande do Sul, Código 43, e região SUL\n");
                    break;

                        default:
                        System.out.printf("Sigla inserida é inválida\n");

        }
            
        
    }
}
