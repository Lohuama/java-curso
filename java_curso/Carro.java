package java_curso;

public class  Carro {
    String modelo;

    public static void main(String[] args){
        System.out.println("teste");
    }
    public  Carro(String modelo){
        this.modelo = modelo;
    }

    protected String acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
        return "oi";
    }
}

class Rodas {
    public Rodas(){
        Carro carro = new Carro("HB20");
        carro.acelerar();
    }
}


