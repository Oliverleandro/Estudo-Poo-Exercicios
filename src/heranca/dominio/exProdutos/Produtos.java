package heranca.dominio.exProdutos;

public class Produtos {
    private String nome;
    private String marca;
    private double preco;


    public Produtos(String nome, String marca, double preco){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public String toString(){
        System.out.println("-----------Relátorio de produtos-------------");
        return "Nome do produto: " + this.getNome() + "\n" + "Marca: "+ this.getMarca() + "\n"+ "Preço: " + this.getPreco();
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getMarca(){
        return this.marca;
    }
}
