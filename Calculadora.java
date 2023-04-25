import java.util.Scanner;

public class Calculadora{
    public static void main (String []args){

        float a, b, result;
        String op;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        System.out.println("Insira A: ");
        a = entrada.nextFloat();

        System.out.println("Insira b: ");
        b = entrada.nextFloat();

        System.out.println("Insira op +, -, * ou /: ");
        op = entrada.next();
        entrada.close();

        switch (op){
            case "+":
            result = a + b;
            System.out.printf("%.2f + %.2f + %.2f \n", a,b,result);
            break;
        
            case "-":
            result = a - b;
            System.out.printf("%.2f - %.2f - %.2f \n", a,b,result);
            break;

            case "*":
            result = a * b;
            System.out.printf("%.2f * %.2f * %.2f \n", a,b,result);
            break;

            case "/":
            result = a / b;
            System.out.printf("%.2f / %.2f / %.2f \n", a,b,result);
            break;

            default:
            System.out.printf("Operação inválida");

        }

    }
}