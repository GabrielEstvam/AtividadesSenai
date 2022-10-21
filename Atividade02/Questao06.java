package Atividade02;

import java.util.Scanner;

/*
 * Escreva um programa para calcular O IMC (índice de massa corpórea) que indica o grau de obesidade de uma pessoa.
 */
public class Questao06 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double altura, peso, imc;
        
        System.out.println("##############################");
        System.out.println("Calculadora de IMC");
        System.out.println("Digite seu peso:");
        peso = in.nextDouble();
        System.out.println("Digite sua altura");
        altura = in.nextDouble();
        altura = altura*altura;
        imc = peso /altura;
        System.out.println("Seu IMC é: "+imc);
        if (imc < 20)
        {
            System.out.println("Peso abaixo do normal");
        }
        else if (imc > 20 & imc <=25)
        {
            System.out.println("Peso normal");
        }
        else if (imc > 25 & imc <=30)
        {
            System.out.println("Sobrepeso");
        }
        else if (imc > 30 & imc <=35)
        {
            System.out.println("Obsidade leve");
        }
        else if (imc > 35 & imc <=40)
        {
            System.out.println("Obsidade Moderada");
        }
        else
        {
            System.out.println("Obesidade Severa");
        }
        System.out.println("##############################");
    }    
}
