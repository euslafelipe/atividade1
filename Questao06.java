package atividade1;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor da conta:");
        Double contav = ler.nextDouble();
        
        System.out.println("quantas pessoas vão dividir a conta:");
        int pessoas = ler.nextInt();
        Double divisao = Double.valueOf(pessoas);
        divisao = contav / pessoas;
         System.out.println("Cada pessoa vai pagar:"+ divisao);


    ler.close();

    }
    
}
