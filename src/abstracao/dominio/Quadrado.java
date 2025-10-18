package abstracao.dominio;

public class Quadrado implements FormaGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return this.getLado() * this.getLado();
    }

    @Override
    public void imprime() {
        System.out.println("O resultado do cálculo geometrico foi: " + this.calcularArea() + "m^2");
    }

    public double getLado(){
        return this.lado;
    }
}
