package atividades.atividade1;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor do jantar:");
        Double valorj = ler.nextDouble();
        Double porcentagem = 0.1 * valorj;

        System.out.println("lembrando que a taxa do garçom é de 10%");

         double valorc = valorj + (porcentagem);
         System.out.println("o valor da refeição foi:"+ valorc);


        ler.close();

    }
    
}
