package classeObjetoEncapsulamento.exercicioEstudante.dominioEstudante.mains;

import classeObjetoEncapsulamento.exercicioEstudante.dominioEstudante.Estudante;

public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante("Leandro", "1", "ADS", -1);
        Estudante estudante02 = new Estudante("Gabriel", "2", "IA mananger", 1);

        System.out.println(estudante01.toString());
        System.out.println(estudante02.toString());
    }
}
