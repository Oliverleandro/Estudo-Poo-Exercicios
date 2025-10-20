package heranca.exercicioEscola.dominio;

public class Pessoa implements ImprimeRelatorio {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade ) {
        this.nome = nome;
        this.idade = idade;

    }

    @Override
    public void relatorio() {
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}
