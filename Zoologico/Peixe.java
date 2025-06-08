package Zoologico;

public class Peixe extends Animal implements Aquatico {
    @Override
    public void emitirSom() {
        System.out.println("GLUB GLUB");
    }
    @Override
    public void alimentar() {
        System.out.println("O peixe está se alimentando de algas.");
    }
    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}