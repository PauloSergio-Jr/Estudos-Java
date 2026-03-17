package fase2;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.marca = "chevrolet";
        carro1.modelo = "corsa classic";
        carro1.ano = 2010;

        carro1.descricao();

        Carro carro2 = new Carro();

        carro2.marca = "renault";
        carro2.modelo = "fluence";
        carro2.ano = 2014;

        carro2.descricao();

    }

}
