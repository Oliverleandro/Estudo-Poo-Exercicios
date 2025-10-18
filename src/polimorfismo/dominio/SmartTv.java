package polimorfismo.dominio;

public class SmartTv extends AparelhoEletronico {
    public SmartTv(String nome, String marca, int anoLancamento) {
        super(nome, marca, anoLancamento);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public int getAnoLancamento() {
        return super.getAnoLancamento();
    }


    public void play() {
        System.out.println("Iniciando um filme na netflix...");
    }
}
