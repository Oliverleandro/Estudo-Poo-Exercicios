package heranca.exercicioEscola.main;

import heranca.exercicioEscola.dominio.Estudante;
import heranca.exercicioEscola.dominio.Pessoa;
import heranca.exercicioEscola.dominio.Professor;

public class MainEscola {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante("Leandro", 20, "202503649545", "Analise e desenvolvimento de sistemas");
        Professor professor = new Professor("Thiago", 37, "123456", "Top big data");
        Pessoa estudante02 = new Estudante("Gabriel", 23, "202503649546", "IA enginer");

        estudante01.relatorio();
        professor.relatorio();
        estudante02.relatorio();

    }
}
