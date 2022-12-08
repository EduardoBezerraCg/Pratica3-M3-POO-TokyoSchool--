
class Veículo {
        public void ligar(){
        System.out.println("Bruuuum");

    }

}

class Moto extends Veículo {
    public void ligar(){
        System.out.println("vraaaaaaaam");
    }
}

class Trator extends Veículo{
    public void ligar(){
        System.out.println("Trator faz Bruuuum");
    }
}

class Bicicleta extends Veículo{
    public void ligar(){
        System.out.println("bicicleta náo faz barulho mas cai a corrente");

    }
}

class Pernas extends Veículo{
    public void ligar(){
        System.out.println("As pernas cansam ao andar");
    }
}
public class Main {
    public static void main(String[] args) {

        Veículo moto = new Moto();
        Veículo trator = new Trator();
        Veículo bicicleta = new Bicicleta();
        Veículo pernas = new Pernas ();

        moto.ligar();
        trator.ligar();
        bicicleta.ligar();
        pernas.ligar();


    }
}