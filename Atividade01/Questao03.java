package Atividade01;

import java.util.Scanner;

/*
 * Escreva um programa para ler um nome digitado e mostrar a mensagem "Olá <nome-digitado>".
 */
public class Questao03 
{
    public static void main(String[] args) 
    {
        String nome;
        Scanner in = new Scanner(System.in);
        System.out.println("##############################");
        System.out.println("Mensagem de saudação");
        System.out.println("Digite seu nome:");
        nome = in.nextLine();
        System.out.println("Olá "+ nome);
        System.out.println("##############################");
        in.close();
    }
}
