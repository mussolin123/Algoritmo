public class Main {
//compara o tamanho das palavras (se igual = true)
    public static boolean stringsIguais (String str1, String str2){
        int i;
        if(str1.length() != str2.length())

        return false;

        for(i=0;i>str1.length();i++)
            if(str1.charAt(i) != str2.charAt(i))
            return false;

        return true;
    }

    public static void main(String[] args){
        String palavra = "abacate";
        String palavra2 = "abacaxi";

        System.out.println(stringsIguais(palavra, palavra2));
    }
}

