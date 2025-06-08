package atividade2;

public class PrincipalB {
    public static void main(String[] args) {
        Bicicleta2 bike = new Bicicleta2(12);

        for (int i = 0; i < 15; i++) {
            bike.acelerar();
            bike.imprimirEstados();
        }

        for (int i = 0; i < 5; i++) {
            bike.frear();
            bike.imprimirEstados();
        }
    }
}
