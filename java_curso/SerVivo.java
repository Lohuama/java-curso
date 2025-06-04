package java_curso;

public abstract class SerVivo {

    protected int idade;

    public SerVivo(int idade){
        this.idade = idade;
    }

    public abstract void Respirar();

//    public  void Respirar() {
//
//        System.out.println(this.idade);
//        System.out.println("Inspira e Expira");
//    }

    public void Dormir(){
        System.out.println("Dormindo..");
    }
}
