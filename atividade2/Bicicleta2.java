package atividade2;

public class Bicicleta2 {
    private int velocidade;
    private int marcha;
    private int velocidadeMaxima;

    public Bicicleta2 (int velocidadeMaxima){
        this.velocidade = 0;
        this.marcha = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar() {
        if (this.velocidade < this.velocidadeMaxima) {
            this.velocidade++;
            ajustarMarcha();
        } else {
            System.out.println("\nA velocidade máxima foi atingida! (" + this.velocidadeMaxima + " km/h)\n");
        }
    }

    public void frear(){
        if (this.velocidade > 0){
            this.velocidade--;
        }
        ajustarMarcha();
    }

    private void ajustarMarcha() {
        if (velocidade == 0) {
            marcha = 0;
        } else if (velocidade <= 5) {
            marcha = 1;
        } else if (velocidade <= 10) {
            marcha = 2;
        } else {
            marcha = 3;
        }
    }

    public void imprimirEstados(){
        System.out.println("\nVelocidade: " + this.velocidade + "\n km/h | Marcha: " + this.marcha + "\n  Velocidade Máxima: " + this.velocidadeMaxima + " km/h\n");
    }
}
