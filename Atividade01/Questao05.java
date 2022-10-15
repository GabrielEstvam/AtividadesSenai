package Atividade01;

import java.util.Scanner;

/*
 * Escreva um programa para ler o valor de um jantar, o sistema vai apresentar a taxa do garçom 10% e também o valor
 * <valor refeição> + 10% = <final total>.
 */
public class Questao05
{
    public static void main(String[] args) 
    {
        double valorConta, taxaGarcom;
        Scanner in = new Scanner(System.in);
        System.out.println("##############################");
        System.out.println("Calculadora valor conta restaurante");
        System.out.println("Digite o valor da conta");
        valorConta = in.nextDouble();
        taxaGarcom = valorConta * 0.1;
        taxaGarcom = valorConta+taxaGarcom;
        System.out.println(10/100);
        System.out.println("Valor conta: "+valorConta+" + 10% = "+ taxaGarcom);
        System.out.println("##############################");
    }
}
