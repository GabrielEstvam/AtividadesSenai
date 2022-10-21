package Atividade02;

import java.util.Scanner;

/*
 * Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).
 */
public class Questao03 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int idade;
        
        System.out.println("##############################");
        System.out.println("Posso votar?");
        System.out.println("Digite sua idade:");
        idade = in.nextInt();

        if (idade >=16 )
        {
            System.out.println("Você pode votar");
        }
        else
        {
            System.out.println("Você ainda não pode votar");
        }
        System.out.println("##############################");
    }    
}
