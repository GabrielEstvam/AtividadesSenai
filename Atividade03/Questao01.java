package Atividade03;

import java.util.Scanner;

/*
 * Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.
 */
public class Questao01 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double numero;
        System.out.println("##############################################");
        System.out.println("Tabuada de um número");
        System.out.println("Digite um número para verificar sua tabuada");
        numero = in.nextDouble();

        for(int tabuada = 1; tabuada<=10; tabuada++)
        {
           System.out.println(tabuada+"X"+numero+" = "+numero*tabuada);   
        }
    }
}
