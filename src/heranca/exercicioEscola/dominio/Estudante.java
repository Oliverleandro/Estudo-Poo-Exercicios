package heranca.exercicioEscola.dominio;

public class Estudante extends Pessoa {
    private String curso;
    private String matricula;

    public Estudante(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    @Override
    public void relatorio() {
        System.out.println("------------RELÁTORIO-------------------");
        System.out.println("Nome : " + this.getNome() + "\n" + "Idade: " + this.getIdade() + "\n" + "Matrícula: " + this.getMatricula() +
                "\n" + "Curso: " + this.getCurso());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
