package classeObjetoEncapsulamento.test;

import classeObjetoEncapsulamento.dominio.Cars;

public class Test01 {
    public static void main(String[] args) {
        Cars car = new Cars("BMW i7","BMW", 2025);
        System.out.println(car.toString());
        System.out.println("----------------------------");
        System.out.println("Actions of the Car");
        car.toConnect();
        car.accelerate();
        car.slowDown();
        car.toSwitchOff();
    }
}
