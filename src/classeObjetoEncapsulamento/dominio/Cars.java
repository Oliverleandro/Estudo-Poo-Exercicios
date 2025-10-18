package classeObjetoEncapsulamento.dominio;

public class Cars {
    String name;
    String mark;
    int year;

    public Cars(String name, String mark, int year ){
        this.name = name;
        this.mark = mark;
        this.year = year;
    }

    @Override
   public String toString(){
        return "Name the Car: " + this.name + "\n" + "Mark the Car: " + this.mark + "\n" + "Year the Car: " + this.year;
    }

    public void toConnect(){
        System.out.println("Carro ligado.");
    }

    public void toSwitchOff(){
        System.out.println("Carro desligado.");
    }

    public void accelerate(){
        System.out.println("Carro acelerando....");
    }

    public void slowDown(){
        System.out.println("O carro está desacelerando....");
    }

    public void brake(){
        System.out.println("Carro está freando...");
    }
}
