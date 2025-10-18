package heranca.dominio.exProdutos;

public class Monitor extends Produtos {
    public Monitor(String nome,String marca, double preco) {
        super(nome, marca, preco);
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
    public double getPreco() {
        return super.getPreco();
    }
}
