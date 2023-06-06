//calculando n° primo com FOR
import java.util.Scanner;
public class Primoboolean {
    public static void main (String []args){

        int valor, i;
        boolean primo;
        Scanner sc = new Scanner (System.in);

        System.out.println("entre com o valor");
        valor = sc.nextInt();
        sc.close();

        //estrutura for
        primo = true;
        for (i=2;i<valor;i++){
            System.out.printf("== %d : %b ==\n", i, primo);
            if(valor%i==0){
                primo = false;
                System.out.println("Não é primo\n");
                break;
            }

        }
        if (primo){
            System.out.println("É primo\n");
        }

    }
}
