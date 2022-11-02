package Atividade05;

public class Carro
{
    private String marca, modelo;
    private int velocidade;

    public Carro(String marca, String modelo)
    {
       this.marca = marca;
       this.modelo = modelo;
    }

    public void acelera(int aceleraValor)
    {
        int velocidadeAtual = 0;
        velocidadeAtual  = velocidadeAtual + aceleraValor;
        
        
        if (velocidadeAtual +aceleraValor> 200)
        {
            System.out.println("Acelerando: "+ velocidade+ " + " +aceleraValor+ " = 200");
            velocidade = 200;
        }
        else
        {
            System.out.println("Acelerando: "+ velocidade+ " + " +aceleraValor+ " = "+(velocidade+aceleraValor));
            velocidade = velocidade+aceleraValor;
        }
    }

    public void freia(int freia)
    {
        int velocidadeAtualFreio = velocidade - freia;

        if (velocidadeAtualFreio <= 0)
        {
           System.out.println("Freiando: "+ velocidade+ " - " +freia+" = 0");
           velocidade = 0;
        }
        else
        {
            System.out.println("Freiando: "+ velocidade+ " - " +freia+ " = " +(velocidade-freia));
            velocidade = velocidade-freia;
        }
    }

    private String ToString()
    {
        return "Carro [Marca="+marca+", Modelo="+modelo+", Velocidade="+velocidade+"]";
    }

    public void mostraInformacao()
    {
        System.out.println(ToString());
    }
    
}