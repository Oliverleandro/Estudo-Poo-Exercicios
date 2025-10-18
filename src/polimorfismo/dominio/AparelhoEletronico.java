package polimorfismo.dominio;

import polimorfismo.servico.Play;

public class AparelhoEletronico implements Play {
    private final String nome;
    private final String marca;
    private final int anoLancamento;

    public AparelhoEletronico(String nome, String marca, int anoLancamento){
        this.nome = nome;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
    }

    public String toString(){
        System.out.println("----------Relátorio----------------");
    return "Nome: " + this.getNome() + "\n" + "Marca: " + this.getMarca()
            +"\n" + "Ano de lancamento do produto: " + this.getAnoLancamento();
    }



    public String getNome(){
        return this.nome;
    }

    public String getMarca(){
        return this.marca;
    }

    public int getAnoLancamento(){
        return this.anoLancamento;
    }

    @Override
    public void play() {
        System.out.println("--------------------");
    }
}
