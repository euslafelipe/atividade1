package atividade1;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Valor da sua hora:");
        Double valorh = ler.nextDouble();

        System.out.println("Horas trabalhadas:");
        double horast = ler.nextDouble();

         Double salario = valorh + horast;

        System.out.println(nome+" vai receber "+ salario);

    }


        
}
    
