package atvbicicleta;

public class bicicleta{
    public int velocidade;
    public int marcha;

public bicicleta(int velocidade, int marcha){
    this.velocidade=0;
    this.marcha=0;
}
public void acelerar(){
    velocidade++;
    ajustarmarcha();
}
public void frear(){
    velocidade=velocidade-1;
    ajustarmarcha();
    }
public void ajustarmarcha(){
    if(velocidade==0){
        this.marcha=0;
    }
    else if(velocidade<5){
        this.marcha=1;
    }
    else if(velocidade<7){
        this.marcha=2;
    }
    else{
        this.marcha=3;
    }
}
public void imprimir(){
    System.out.println("Velocidade:"+velocidade+"\nMarcha:"+marcha);
}
}
