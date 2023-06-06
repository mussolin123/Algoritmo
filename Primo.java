//calculando n° primo com FOR
import java.util.Scanner;
public class Primo {
    public static void main (String []args){

        int valor, i,ndiv;
        Scanner sc = new Scanner (System.in);

        System.out.println("entre com o valor");
        valor = sc.nextInt();
        sc.close();

        //estrutura for
        ndiv = 0;
        for (i=1;i<=valor;i++){
            if(valor%i==0){
                System.out.println(i);
                ndiv++;
            }
        }
        if (ndiv <3){
            System.out.println("é primo\n");

        }else{
            System.out.print("Não é primo\n");
        }
    }
}