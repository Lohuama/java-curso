package java_curso;

public class Humano extends SerVivo{

    public String nome;

    public Humano(){
        super( 42);
        this.nome = "Lohuama";
    }

    @Override
    public void Respirar() {
        System.out.println("heihei");
    }
}
