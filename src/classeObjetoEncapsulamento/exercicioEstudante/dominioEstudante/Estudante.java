package classeObjetoEncapsulamento.exercicioEstudante.dominioEstudante;

public class Estudante {
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;

    public Estudante(String nome, String matricula, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
      if (periodo > 0){
         this.periodo = periodo;
      }else {
          System.out.println("erro");
      }
    }

    public String toString(){
        System.out.println("---------------Alunos---------------");
        return "Nome do aluno: " + this.getNome() + "\n" + "Matrícula: " + this.getMatricula() + "\n" + "Curso: " + this.getCurso() +
                "\n" + "Período: " + this.getPeriodo();
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public int getPeriodo(){
        return this.periodo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}
