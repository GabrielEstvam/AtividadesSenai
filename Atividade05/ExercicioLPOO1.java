package Atividade05;

public class ExercicioLPOO1
{
    public static void main(String[] args) 
    {
        Carro carro1 = new Carro("FIAT", "Palio");
        carro1.mostraInformacao();
        carro1.acelera(20);    
        carro1.acelera(50);
        carro1.acelera(200);
        carro1.freia(100);
        carro1.freia(150);
        carro1.mostraInformacao();;
    }
}