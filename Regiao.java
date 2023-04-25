import java.util.Scanner;

public class Regiao {
    
    public static void main (String []args){

        String sigla;

        Scanner entrada;
                
        entrada = new Scanner(System.in);
        System.out.println("Insira uma das siglas - PR, RS, SC, SP ou PA: ");
        sigla = entrada.next();
        entrada.close();

        switch(sigla){

            case "PR":
            case "pr":
            System.out.printf("A Sigla PR refere-se ao Estado do Paraná, Código 41, e região SUL\n");
            break;

                case "SC":
                case "sc":
                System.out.printf("A Sigla SC refere-se ao Estado de Santa Catarina, Código 42, e região SUL\n");
                break;

                    case "RS":
                    case "rs":
                    System.out.printf("A Sigla RS refere-se ao Estado do Rio Grande do Sul, Código 43, e região SUL\n");
                    break;

                        case "SP":
                        case "sp":
                        System.out.printf("A Sigla SP refere-se ao Estado do São Paulo , Código 44, e região Sudeste\n");
                        break;

                            case "PA":
                            case "pa":
                            System.out.printf("A Sigla PA refere-se ao Estado do Pará , Código 49, e região Norte\n");
                            break;

                        default:
                        System.out.printf("Sigla inserida é inválida\n");

        }
            
        
    }
}
