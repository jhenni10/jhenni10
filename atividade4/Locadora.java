public class Locadora {
    public static void main(String[] args){
        Carro carro = new Carro("Civic G10", 2025);
        Moto moto = new Moto ("Yamaha Fazer", 2025);
        BicicletaEletrica bike = new BicicletaEletrica("Sense Easy", 2022);

        carro.alugar();
        carro.abastecer();

        moto.alugar();
        moto.abastecer();

        bike.alugar();
    }
}