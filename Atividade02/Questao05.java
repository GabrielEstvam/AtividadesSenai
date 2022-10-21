package Atividade02;

import java.util.Scanner;

/*
 * Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: “Não pode nem votar e nem dirigir”,
 *  “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.
 */
public class Questao05 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int idade;
        
        System.out.println("##############################");
        System.out.println("Posso Votar ou Dirigir?");
        System.out.println("Digite sua idade:");
        idade = in.nextInt();

        if (idade <18 & idade >=16 )
        {
            System.out.println("Você pode votar mas não dirigir");
        }
        else if (idade >=18)
        {
            System.out.println("Você pode votar e dirigir");
        }
        else
        {
            System.out.println("Você não pode votar nem dirigir");
        }
        System.out.println("##############################");
    }    
}
