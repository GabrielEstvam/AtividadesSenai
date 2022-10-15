package Atividade01;

import java.util.Scanner;

/*
 * Escreva um programa para ler um número e o sistema vai mostra os números vizinhos, o anterior e o próximo número.
 */
public class Questao02 
{
    public static void main(String[] args) 
    {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("##############################");
        System.out.println("Números Vizinhos");
        System.out.println("Digite um número para saber seus vizinhos:");
        numero = in.nextInt();
        System.out.println("Os vizinhos do número " + numero+ " são "+(numero-1)+ " e "+ (numero+1));
        System.out.println("##############################");
    }
}
