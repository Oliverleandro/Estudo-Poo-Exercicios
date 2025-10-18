package abstracao.test;

import abstracao.dominio.Quadrado;

public class abstracaoTest {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        quadrado.calcularArea();
        quadrado.imprime();
    }
}
