package atvbicicleta;

public class principal {
    public static void main(String[] args) {
        bicicleta bc=new bicicleta(0, 0);
    System.out.println("Status inicial:");
        bc.imprimir();
        
    System.out.println("-----------------");
    System.out.println("Status de acelerar:");
    for(int i=1;i<7;i++){
        bc.acelerar();
        bc.imprimir();
    }
    System.out.println("-----------------");
    System.out.println("Status de frear:");
    for(int i=0;i<4;i++){
        bc.frear();
        bc.ajustarmarcha();
        bc.imprimir();
    }
    }
}