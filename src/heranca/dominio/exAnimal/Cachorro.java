package heranca.dominio.exAnimal;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void comer() {
        super.comer();
    }

   public void latir(){
        System.out.println("Este cachorro está latindo.");
    }
}
