package classeObjetoEncapsulamento.test;

import classeObjetoEncapsulamento.dominio.Dog;

public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog("Lupi", "Labrador", 6);
        System.out.println(dog.toString());
        dog.latir();
        dog.pararLatir();
        dog.sentar();
        dog.darPata();
        dog.deitar();
        dog.rolar();
        dog.fingirMorto();
        dog.aVontade();
    }
}
