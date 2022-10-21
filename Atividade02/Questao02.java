package Atividade02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
 */
public class Questao02 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int numero;
        List<Integer> numeros= new ArrayList<>();   
        System.out.println("##############################");
        System.out.println("Qual o maior e menor número Inteiro?");
       for(int i = 0; i <3; i++)
       {
            System.out.println("Digite o "+(i+1)+"° número");
            numero = in.nextInt();
            numeros.add(i,numero);
       }
        numeros.sort(null);
        System.out.println("O menor número é: "+numeros.get(0));
        System.out.println("O maior número é: "+numeros.get(numeros.size()-1));
        System.out.println("##############################");
    }    
}
