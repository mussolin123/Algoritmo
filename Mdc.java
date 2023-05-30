import java.util.Scanner;

//calculo do maximo divisor comum de dois valores
public class Mdc {
    public static void main(String[] args) {

        int a,b,i, mdc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("valores");
        a = entrada.nextInt();
        b = entrada.nextInt();
        entrada.close();

        i = 1;
        mdc = 0;
        while (i<=a && i<=b){
            if(a % i == 0 && b % i == 0){
                mdc = i;
            }

            i++;

        }
        System.out.printf("MDC (%d, %d) = %d\n",a, b, mdc);

    }
}
