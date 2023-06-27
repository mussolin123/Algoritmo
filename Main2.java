class Main2{

    //faz a sequência com *, semppre diminuindo com recursividade (esse deu cert)
    public static void linhaCaractere(int x){
        int i;
        for (i=0;i<x;i++){
            System.out.printf("*");
        }

        System.out.println();
    }
        public static void trianguloRec(int n){
        if(n>0){
            linhaCaractere(n);
            trianguloRec(n-1);

            //linhaCaractere(n); ao tirar o coment, fica recursivo
        }
    }
    public static void main(String[] args) {
    trianguloRec(10);
        }
    }
