package Atividade03;

import java.util.Scanner;

/*
 * Escreva um programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.
 */
public class Questao02 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String mensagem;
        int quantidade;
        System.out.println("##############################################");
        System.out.println("Repetição de mensagem");
        System.out.println("Digite sua mensagem:");
        mensagem = in.nextLine();
        System.out.println("Quantas vezes deseja que esta mensagem se repita?");
        quantidade = in.nextInt();


        for(int i = 1; i<=quantidade; i++)
        {
           System.out.println(i+" "+mensagem);   
        }
    }
}
