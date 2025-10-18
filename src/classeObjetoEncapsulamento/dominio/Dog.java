package classeObjetoEncapsulamento.dominio;

public class Dog {
    private String name;
    private String race;
    private int year;

    public Dog(String name, String race, int year){
        this.name =  name;
        this.race = race;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" + "Race: " + this.getRace() + "\n" + "Year(s) the dog: " + this.getYear();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRace(){
        return this.race;
    }

    public void setRace(String race){
        this.race = race;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void latir(){
        System.out.println("Cachorro está latindo.");
    }

    public void pararLatir(){
        System.out.println("Cachorro parou de latir.");
    }

    public void sentar(){
        System.out.println("Cachorro sentou.");
    }

    public void darPata(){
        System.out.println("Cachorro dar a pata.");
    }

    public void deitar(){
        System.out.println("Cachorro deitou.");
    }

    public void rolar(){
        System.out.println("Cachorro rolou.");
    }

    public void fingirMorto(){
        System.out.println("Cachorro se fingiu de morto.");
    }

    public void aVontade(){
        System.out.println("Cachoro está a vontade.");
    }
}
