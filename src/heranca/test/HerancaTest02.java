package heranca.test;

import heranca.dominio.exProdutos.Monitor;
import heranca.dominio.exProdutos.Mouse;
import heranca.dominio.exProdutos.Teclado;

public class HerancaTest02 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("lG white 144hz", "LG", 3900);
        Teclado teclado = new Teclado("Lemox", "lemox1", 80);
        Mouse mouse = new Mouse("Lemox", "lemox01", 50);


        System.out.println(monitor.toString());

        System.out.println(teclado.toString());

        System.out.println(mouse.toString());

    }
}
