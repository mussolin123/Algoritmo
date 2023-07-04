public class Main {
    public static void main (String[] args){
        //tranformar string em inteiro, e vice-versa

        String str_numero ="123";
        int int_num = 123;

        //string converte para int
        str_numero = Integer.toString(int_num);
        //comprovamos que deu certo, somando com 7, o resultado deve ser 130
        System.out.println(str_numero + "7");
        
        //aqui fazemos o contrario o int passa a ser String e não "soma"
        int_num = Integer.parseInt(str_numero);//transforma o dado
        System.out.println(int_num+7);
    }
}