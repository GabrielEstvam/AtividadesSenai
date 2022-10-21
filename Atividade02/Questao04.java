package Atividade02;

import java.util.Scanner;

/*
 * Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18).
 */
public class Questao04 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int idade;
        
        System.out.println("##############################");
        System.out.println("Posso Dirigir?");
        System.out.println("Digite sua idade:");
        idade = in.nextInt();

        if (idade >=18 )
        {
            System.out.println("Você pode dirigir");
        }
        else
        {
            System.out.println("Você ainda não pode dirigir");
        }
        System.out.println("##############################");
    }    
}
