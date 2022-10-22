package Atividade03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o menor a soma e a média dos números digitados.
 */
public class Questao06 
{
      
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        double numero, soma = 0;
        System.out.println("##############################################");
        System.out.println("Maior, menor, some e media de números");
        
        for(int i =1; i<=5; i++)
        {
            System.out.println("Digite o "+i+"° número");
            numero = in.nextDouble();
            numeros.add(numero);
            soma += numero;
        }
        numeros.sort(null);
        System.out.println("O maior número digitado é: "+numeros.get(4));
        System.out.println("O menor número digitado é: "+numeros.get(0));
        System.out.println("A soma dos número digitados é: "+soma);
        System.out.println("A média dos número digitados é: "+(soma/5));
    }
}
