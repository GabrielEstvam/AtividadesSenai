package Atividade01;

import java.util.Scanner;

/*
 *  Escreva um programa para ler 2 notas, o sistema vai apresentar a média final, 
 *  se nota maior que 7 incluir mensagem "aprovado" senão "reprovado".  
 */
public class Questao01
{
    public static void main(String[] args) 
    {
        
        int nota1, nota2;
        double media;
        Scanner ler = new Scanner(System.in);

        System.out.println("##############################");
        System.out.println("Calculadora de média");    
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextInt();
        media = ((nota1+nota2)/2);
        System.out.println("Média = " + media);
        
        if(media >= 7)
        {
            System.out.println("Aprovado.");
        }
        else
        {
            System.out.println("Reprovado");
        }
        System.out.println("##############################");
    }
}
