class Main3 {
    // fazer a soma do numero até chegar na soma dele. Ex: x =5, então 5+1, 5+2, 5+3, 5+4, e 5+5;


    public static int somaRec (int x){
        if (x>0)
        return (x + somaRec(x-1));

            return 0;
        }
    
public static void main (String[] args){
        int x=1000;
        System.out.println(somaRec(x));

    }
}
    
