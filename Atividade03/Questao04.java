package Atividade03;

import java.util.Scanner;

/*
 * Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" 
 * se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
 */
public class Questao04 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String palavra;
        System.out.println("##############################################");
        System.out.println("Adivinhe a palavra correta");
        
        for(int i =1; i<=5; i++)
        {
            System.out.println("Digite a palavra, (Você tem "+(6-i)+" tentativas)");
            palavra = in.nextLine();

            if(i==5)
            {
                System.out.println("Suas tentavias acabaram! =(");
                System.exit(0);
            }
            if(palavra.equals("Java-2022"))
            {
                System.out.println("Você acertou a palavra!");
                System.exit(0);
            }
            else
            {
                System.out.println("Palavra errada, tente novamente!");
            }

        }
    }
}
