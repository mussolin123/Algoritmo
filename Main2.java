class Main2 {
//decrementa com recursividade. Chama a função decrementa, e e executa o decremento que chamou ele;
//por isso repete 5 --0 e 0 --5;                                                                     
    public static void decrementa(int x){
        System.out.println(x);
        if (x>0) //no IF se for uma linha só não precisa abrir e fechar chaves
        decrementa (x-1);
        System.out.println(x);
            }
    
public static void main (String[] args){
        int x=5;
        decrementa(x);
    }
}