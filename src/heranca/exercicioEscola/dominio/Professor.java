package heranca.exercicioEscola.dominio;

public class Professor extends Pessoa {
    private String matricula;
    private String disciplina;

    public Professor(String nome, int idade, String matricula, String disciplina) {
        super(nome, idade);
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    @Override
    public void relatorio() {
        System.out.println("------------RELÁTORIO-------------------");
        System.out.println("Nome : " + this.getNome() + "\n" + "Idade: " + this.getIdade() + "\n" + "Matrícula: " + this.getMatricula() +
                "\n" + "Disciplina: " + this.getDisciplina());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
