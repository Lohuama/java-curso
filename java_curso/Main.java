package java_curso;

public class Main {
    public static void main(String[] args){
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Sandero");
        Carro meuCarro2 = new Carro("BMW");

        String result = meuCarro.acelerar();
        System.out.println(result);
    }
}

