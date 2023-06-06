import java.util.Scanner;
public class Tabuada {
    public static void main (String []args){

        int x, i, result;
        Scanner sc = new Scanner (System.in);

        System.out.println("entre com o valor");
        x = sc.nextInt();
        sc.close();

        //estrutura for
        // para i de 1 ate 10 passo 1 faça
        //sempre ";;" dois pontos e virgula
        // para ir de 1 ate 10, passo 1, aumentando de 1 a 1 até 10
        System.out.printf("for");

        for(i=1;i<10;i++){
            result = x*i;

            System.out.printf("%dx%d=%d\n",x,i, result);

        }
    }
}

