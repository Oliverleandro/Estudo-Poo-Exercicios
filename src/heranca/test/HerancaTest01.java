package heranca.test;

import heranca.dominio.exAnimal.Cachorro;

public class HerancaTest01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Lupi");
        System.out.println(cachorro.toString());
        cachorro.comer();
        cachorro.latir();
    }
}
