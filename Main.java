public class Main{
    //faz a contagem decrescente do número
    public static void contagemDecrescente (int x){
        while(x>=0){
            System.out.println(x);
            x--;
        }
    }

    public static void contagemDecrescenteRec (int x){
        System.out.println(x);
        if(x>0){
            x--;
            contagemDecrescente(x);
        }
    }

    public static void main (String[] args){
        int x=5;
        contagemDecrescenteRec(x);
    }
}