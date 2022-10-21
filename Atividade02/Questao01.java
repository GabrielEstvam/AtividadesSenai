package Atividade02;

import java.util.Scanner;

/*
 * Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero
 */
public class Questao01 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double numero;
        
        System.out.println("##############################");
        System.out.println("Relação de um número a 0");
        System.out.println("Digite um número para verificação:");
        numero = in.nextDouble();

        if (numero > 0)
        {
            System.out.println("Este número é maior que 0");
        } 
        else if (numero < 0) 
        {
            System.out.println("Este número é menor que 0");
        }
        else
        {
            System.out.println("Número digitado igual a 0");
        }
        System.out.println("##############################");1
    }    
}
