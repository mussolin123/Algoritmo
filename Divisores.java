//Maximo divisor comum em FOR (MMC)

import java.util.Scanner;
public class Divisores {
    public static void main (String []args){

        int valor, i;
        Scanner sc = new Scanner (System.in);

        System.out.println("entre com o valor");
        valor = sc.nextInt();
        sc.close();

        //estrutura for
        for (i=1;i<=valor;i++){
            if(valor%i==0){
                System.out.println(i);
            }
        }
    }
}