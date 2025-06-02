import java.util.ArrayList;

public class conceitos {
    public static void conceitos(String[] args) {

        // comando copilar: javac Main.java

        // inteiros
        //    byte => 8 bits => -128 a 127
        //    short => 16 bits => -32.768 a 32.767
        //    int => 32 bits => 2.147.483.648 a 2.147.483.647
        //    long => 64 bits

        // decimais
        //float => 32 bits => precisao simples
        //double => 64 bits => precisao dupla

        //String => palavras e frases => usa aspas duplas ""
        //char => um unico caractere => a,b,c,d  => usa aspas simples ''

        //boolean => true ou false

        byte b = 100;
        short s = 10000;
        // int i = 100000;
        long l = 10000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Fernanda";
        boolean bool = true;

        String[] nomesArr = new String[10];
        nomesArr[0] = "oi";

        int[] colecaoDeInteiros = {1,2,3,4,5};

        if(b > 101){
            System.out.println("Verdadeiro") ;
        }else{
            System.out.println("False");
        }

        System.out.println(colecaoDeInteiros[4]);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lohuama");
        nomes.add("lala");
        nomes.add("lili");
        System.out.println(nomes);
        //nomes.remove(1);
        System.out.println(nomes.get(0));

        System.out.println("---");
        for(int i = 0; i < nomesArr.length; i++){

            System.out.println(nomesArr[i]);
        }

        for (String nome : nomes){
            System.out.println(nome);
        }

        int cont = 0;
        while (cont < 10){
            System.out.println("while" + cont);
            cont++;
        }

        // casting (transformar tipos de variaveis em outros tipos)
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        String meuStr = "10";
        int meuInt = Integer.parseInt(meuStr);



    }
}
