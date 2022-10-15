package Atividade01;

import java.util.Scanner;

/*
 * Escreva um programa para ler o nome, valor da hora, quantas horas trabalhadas, o sistema vai apresentar o salário.
 * <fulano> vai receber R$<00.00>
 */
public class Questao04 
{
   public static void main(String[] args) 
   {
    String nome;
    float horasTrabalhadas, valorHora, salario;
    Scanner in = new Scanner(System.in);
    System.out.println("##############################");
    System.out.println("Calculadora de salário");
    System.out.println("Digite o nome do fucionário:");
    nome = in.nextLine();
    System.out.println("Qual o valor da hora trabalhada do funcionário: "+nome+" ?");
    valorHora = in.nextFloat();
    System.out.println("Quantas horas foram trabalhadas?");
    horasTrabalhadas = in.nextFloat();
    salario = horasTrabalhadas*valorHora;
    System.out.println("O funcionario "+nome+" deve receber: R$"+salario);

    System.out.println("##############################"); 
   } 
}
