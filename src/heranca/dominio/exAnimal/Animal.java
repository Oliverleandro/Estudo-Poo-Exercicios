package heranca.dominio.exAnimal;

public class Animal {
    String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Nome do animal: " + this.nome;
    }

    public void comer(){
        System.out.println("Estes animal está comendo");
    }
}
