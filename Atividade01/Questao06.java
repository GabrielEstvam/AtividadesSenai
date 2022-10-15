package Atividade01;

import java.util.Scanner;

/*
 * Escreva um programa para ler o valor de uma conta e quantas pessoas vão dividir a conta, 
 * o sistema vai apresentar quanto cada pessoa vai pagar.
 */
public class Questao06
{
    public static void main(String[] args) 
    {
        double valorConta, valorParte;
        int quantidadePessoas;
        Scanner in = new Scanner(System.in);
        System.out.println("##############################");
        System.out.println("Calculadora divisão valor conta");
        System.out.println("Digite o valor da conta");
        valorConta = in.nextDouble();
        System.out.println("Quantas pessoas dividirão a conta?");
        quantidadePessoas = in.nextInt();
        valorParte = valorConta/quantidadePessoas;
        System.out.println("O valor da conta(R$"+valorConta+") para cada parte ("+quantidadePessoas+") é :R$ "+valorParte);
        System.out.println("##############################");
    }
}
