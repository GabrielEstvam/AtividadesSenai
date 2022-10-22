package Atividade03;

import java.util.Scanner;

/*
 * Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os número entre os 2 digitados.
 */
public class Questao03 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int primeiroNumero, segundoNumero;
        System.out.println("##############################################");
        System.out.println("Intervalo entre dois números Inteiros");
        System.out.println("Digite o primeiro número:");
        primeiroNumero = in.nextInt();
        System.out.println("Digite o segundo número:");
        segundoNumero = in.nextInt();
        System.out.println("O intervalo entre estes dois números é: ");
        while (primeiroNumero < segundoNumero-1) 
        {
            System.out.println(primeiroNumero+1);
            primeiroNumero++;    
        }
 
    }
}
