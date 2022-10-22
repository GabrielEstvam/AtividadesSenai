package Atividade03;

import java.util.Scanner;

/*
 * Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.
 */
public class Questao05 
{
      
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String nomePessoa;
        int idade, quantidadeMenor =0, quantidadeMaior=0;
        System.out.println("##############################################");
        System.out.println("Quais pessoas são maior e menor de idade");
        
        for(int i =1; i<=5; i++)
        {
            System.out.println("Digite o nome da "+i+"° pessoa");
            nomePessoa = in.next();
            System.out.println("Digite a idade de "+ nomePessoa);
            idade = in.nextInt();
                      
            if(idade >=18)
            {
               quantidadeMaior +=1;
            }
            else
            {
               quantidadeMenor +=1;
            }
        }
        
        System.out.println("Quantidade de pessoas maiores de idade: "+quantidadeMaior);
        System.out.println("Quantidade de pessoas menores de idade: "+quantidadeMenor );
    }
}
